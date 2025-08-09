package com.wipro.hibernatedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pan")
public class Pan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;	
	
		
		@Column(name="panholder_name")
		String panholderName;	
		@Column(name="pan_number")
		String panNumber;
		

		public Pan() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Pan( String panholderName, String panNumber) {
			super();
			this.id = id;
			this.panholderName = panholderName;
			this.panNumber = panNumber;
		}
		
	

		public Pan(int id, String panholderName, String panNumber) {
			super();
			this.id = id;
			this.panholderName = panholderName;
			this.panNumber = panNumber;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getPanholderName() {
			return panholderName;
		}


		public void setPanholderName(String panholderName) {
			this.panholderName = panholderName;
		}


		public String getPanNumber() {
			return panNumber;
		}


		public void setPanNumber(String panNumber) {
			this.panNumber = panNumber;
		}


		@Override
		public String toString() {
			return "Pan [id=" + id + ", panholderName=" + panholderName + ", panNumber=" + panNumber + "]";
		}


		public static void deleteById(int id1) {
			// TODO Auto-generated method stub
			
		}


		
		

}
