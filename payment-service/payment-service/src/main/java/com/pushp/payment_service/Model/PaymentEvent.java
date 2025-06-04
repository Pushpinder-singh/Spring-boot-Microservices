package com.pushp.payment_service;

public class PaymentEvent {
    private String orderId;
    private String eventType;

    public PaymentEvent(String orderId, String eventType) {
        this.orderId = orderId;
        this.eventType = eventType;
    }

    // Getters and setters
}