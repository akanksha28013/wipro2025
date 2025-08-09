package com.wipro.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wipro.springdemo.bean.Department;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
       Department department = (Department) apc.getBean("department");
       
       department.setDeptCode("Fin");
       department.setDepartmentName("Finance");
       System.out.println(department);
       
    }
}
