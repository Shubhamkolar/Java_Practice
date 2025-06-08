package com.example.user;

public class Order {
    private String orderId;
    private String item;
    private String userId;

    public Order() {}

    public Order(String orderId, String item, String userId) {
        this.orderId = orderId;
        this.item = item;
        this.userId = userId;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}
