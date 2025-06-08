package com.example.order;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/user/{userId}")
    public List<Order> getOrdersByUser(@PathVariable String userId) {
        return List.of(
                new Order("1", "Book", userId),
                new Order("2", "Laptop", userId)
        );
    }
}
