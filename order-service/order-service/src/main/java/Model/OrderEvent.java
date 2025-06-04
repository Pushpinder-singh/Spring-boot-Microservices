package com.pushp.order_service;

public class OrderEvent {
    private String orderId;
    private String eventType;

    public OrderEvent(String orderId, String eventType) {
        this.orderId = orderId;
        this.eventType = eventType;
    }

    // Getters and setters
}