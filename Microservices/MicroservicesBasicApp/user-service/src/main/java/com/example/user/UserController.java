package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private OrderClient orderClient;

    @GetMapping("/{userId}")
    public Map<String, Object> getUserWithOrders(@PathVariable String userId) {
        User user = new User(userId, "Shubham");
        List<Order> orders = orderClient.getOrdersByUser(userId);

        Map<String, Object> response = new HashMap<>();
        response.put("user", user);
        response.put("orders", orders);
        return response;
    }
}
