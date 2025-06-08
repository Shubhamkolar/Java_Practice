package com.example.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "order-service", url = "http://localhost:8081")
public interface OrderClient {
    @GetMapping("/orders/user/{userId}")
    List<Order> getOrdersByUser(@PathVariable("userId") String userId);
}
