package com.wipro.hibernatedemo.repo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.wipro.hibernatedemo.entity.Pan;
import com.wipro.hibernatedemo.util.HibernateUtil;

public class PanRepo {
	
	 public static void updatePan()
	    {
	    	
	    	Scanner sc= new Scanner(System.in); 
	    	
	    	System.out.println("Please enter pan id");
	    	int id= sc.nextInt();
	    	System.out.println("Please enter pan name");
	    	String panName= sc.next();
	    	System.out.println("Please enter pan number");
	    	String panNumber= sc.next();
	    	
	    	Pan n= new Pan(id,panName,panNumber);
	    	save(n);
	    }
	    
	 public static void createPan()
	    {
	    	Scanner sc= new Scanner(System.in); 
	    	
	    	System.out.println("Please enter Pan Number");
	    	String panNumber= sc.next();
	    	System.out.println("Please enter Pan name");
	    	String panName= sc.next();
	    	
	    	
	    	Pan n= new Pan(panName,panNumber);
	    	save(n);
	    	
	    	
	    }
	    //insert and update
	 public static void save(Pan n)
	    {
	    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	
	    	if(n.getId()!=0)//update
	    	{
	    		Pan m1=findById(n.getId());
	    		
	    		m1.setPanholderName(n.getPanholderName());
	    		m1.setPanNumber(n.getPanNumber());
	    		session.persist(m1);
	    	}
	    	else {//insert
	    	   	session.persist(n);
	    	}
	    	transaction.commit();     	
	    	
	    }
	    
	 public static Pan findById(int id)
	    {
	     	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	Pan m=session.find(Pan.class, id);
	    	return m;
	    	
	    }
	    
	 public static Pan deleteById(int id)
	    {
	     	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	Pan m=session.find(Pan.class, id);
	    	session.remove(m);
	    	transaction.commit();
	    	return m;
	    	
	    }
	    
	 public static List<Pan> findAll()
	    {
	    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	//sql=>db tables
	    	//hql->java entities
	    	String hqlQuery="from Pan";//select * from pan
	    	Query query=session.createQuery(hqlQuery);
	    	List<Pan> list=query.list();
	    	return list;
	    	
	    	
	    	
	    }
	    
	 public static List<String> findAllPanNames()
	    {
	    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	//sql=>db tables
	    	//hql->java entities
	    	String hqlQuery="SELECT panholderName from Pan";//select movie_name from movie
	    	Query query=session.createQuery(hqlQuery);
	    	List<String> list=query.list();
	    	return list;   	
	    	
	    	
	    }
	    
	 public static List<Pan> findByPanNumber(String panNumber)
	    {
		 Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	//sql=>db tables
	    	//hql->java entities
	    	String hqlQuery="from Pan where panNumber=:panNumber";//select *  from movie where movie_language=''
	    	Query query=session.createQuery(hqlQuery,Pan.class);
	    	query.setParameter("panNumber",panNumber);
	    	List<Pan> list=query.list();
	    	return list;   	
	    	
	    	
	    }

}