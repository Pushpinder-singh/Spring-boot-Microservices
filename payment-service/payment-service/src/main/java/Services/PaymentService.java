package com.pushp.payment_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private KafkaTemplate<String, PaymentEvent> kafkaTemplate;

    public void processPayment(OrderEvent orderEvent) {
        Payment payment = new Payment();
        payment.setOrderId(orderEvent.getOrderId());
        payment.setAmount(100); // Assume a fixed amount for simplicity
        payment.setStatus("COMPLETED");
        paymentRepository.save(payment);
        kafkaTemplate.send("payment-events", new PaymentEvent(payment.getOrderId(), "PAYMENT_COMPLETED"));
    }
}