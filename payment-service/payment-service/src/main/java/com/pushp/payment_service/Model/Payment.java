package com.pushp.payment_service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    private String id;
    private String orderId;
    private double amount;
    private String status;

    // Getters and setters
}