package com.example.orderapp.sqslistener;

import com.example.orderapp.model.Order;
import io.awspring.cloud.dynamodb.DynamoDbTemplate;
import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class OrderQueueListener {

    private final DynamoDbTemplate dynamoDbTemplate;
    private final ObjectMapper objectMapper;

    public OrderQueueListener(DynamoDbTemplate dynamoDbTemplate, ObjectMapper objectMapper) {
        this.dynamoDbTemplate = dynamoDbTemplate;
        this.objectMapper = objectMapper;
    }

    @SqsListener("order-queue")
    public void receiveMessage(String message) {
        Order order = parseMessage(message);
        dynamoDbTemplate.save(order);
    }

    private Order parseMessage(String message) {
        try {
            return objectMapper.readValue(message, Order.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao converter mensagem JSON para Order", e);
        }
    }
}


