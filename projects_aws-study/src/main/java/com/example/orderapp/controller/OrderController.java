package com.example.orderapp.controller;

import com.example.orderapp.model.Order;
import com.example.orderapp.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

     public OrderController(OrderService orderService){
         this.orderService = orderService;
     }

     @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order){
         orderService.publishOrder(order);
         return  ResponseEntity.ok("Pedido recebido!");
     }
}
