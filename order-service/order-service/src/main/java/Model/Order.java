package com.pushp.order_service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    private String id;
    private String product;
    private double price;
    private String status;

    // Getters and setters
}