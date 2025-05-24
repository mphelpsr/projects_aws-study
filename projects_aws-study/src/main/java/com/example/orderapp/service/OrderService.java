package com.example.orderapp.service;

import com.example.orderapp.model.Order;
import io.awspring.cloud.sns.core.SnsTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private SnsTemplate snsTemplate = null;

    public OrderService(SnsTemplate snsTemplate){
        this.snsTemplate = snsTemplate;
    }

    public void publishOrder(Order order){
        snsTemplate.sendNotification("order-events",order.toString(),"new-order");
    }

}
