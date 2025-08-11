package com.wipro.relationdemo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.Data;

@Entity
@Table(name="person")
@Data
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer  id;
	
	@Column(name="person_name")
	String personName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "person_id", referencedColumnName = "id")
	Set<Post> post; 

}
