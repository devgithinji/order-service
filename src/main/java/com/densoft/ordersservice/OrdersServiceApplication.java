package com.densoft.ordersservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class OrdersServiceApplication {

    @Autowired
    private OrderDao orderDao;

    @GetMapping
    public List<Order> fetchOrders(){
        return orderDao.getOrders();
    }

    public static void main(String[] args) {
        SpringApplication.run(OrdersServiceApplication.class, args);
    }

}
