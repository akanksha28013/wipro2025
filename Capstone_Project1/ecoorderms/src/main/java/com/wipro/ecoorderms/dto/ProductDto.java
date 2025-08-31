package com.wipro.ecoorderms.dto;

import lombok.Data;

@Data
public class ProductDto {
    private int id;
    private String prodName;
    private String prodDesc;
    private String prodCat;
    private String make;
    private int availableQty;
    private double price;
    private String uom;
    private double prodRating;
    private String imageURL;
}