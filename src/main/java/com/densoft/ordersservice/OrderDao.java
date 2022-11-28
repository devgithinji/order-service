package com.densoft.ordersservice;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDao {
    public List<Order> getOrders() {
        return List.of(
                new Order(101, "Mobile", 1, 30000),
                new Order(58, "Book", 4, 2000),
                new Order(205, "Laptop", 1, 150000),
                new Order(809, "headset", 1, 1799)
        );
    }
}
