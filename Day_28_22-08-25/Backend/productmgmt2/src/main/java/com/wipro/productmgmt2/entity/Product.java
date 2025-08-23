package com.wipro.productmgmt2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String category;
	
	@Column
	int price;
	
	@Column(nullable = false)
	private Integer qty = 0;

}
