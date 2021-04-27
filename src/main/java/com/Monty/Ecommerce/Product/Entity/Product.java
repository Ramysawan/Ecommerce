package com.Monty.Ecommerce.Product.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "product")
@NoArgsConstructor
@Data
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private String productId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "price")
    private double price;

    @Column(name = "weight")
    private double weight;

    @Column(name = "stock")
    private long stock;

    @Column(name = "photo_url")
    private String photoURL;

    @Column(name = "price_after_discount")
    private double priceAfterDiscount;

    @Column(name = "available_size")
    private String availableSize;

    @Column(name = "available_color")
    private String availableColor;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "date_created")
    private Calendar dateCreated;

    @Column(name = "date_updated")
    private Calendar dateUpdated;


    private String categoryId;


    private String brandId;


    private String vendorId;

    public Product(String title, String description, String barcode, double price, double weight, long stock, String photoURL, double priceAfterDiscount, String availableSize, String availableColor, boolean isActive, Calendar dateCreated, Calendar dateUpdated) {

        this.title = title;
        this.description = description;
        this.barcode = barcode;
        this.price = price;
        this.weight = weight;
        this.stock = stock;
        this.photoURL = photoURL;
        this.priceAfterDiscount = priceAfterDiscount;
        this.availableSize = availableSize;
        this.availableColor = availableColor;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }
}
