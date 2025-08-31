package com.wipro.ecoproductms.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String prodName;
    private String prodDesc;
    private String prodCat;   
    private String make;
    private Integer availableQty;
    private Double price;
    private String uom;       
    private double prodRating;
    private String imageURL;
    private LocalDate dateOfManufacture;
}