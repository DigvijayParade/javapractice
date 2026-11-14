package collection_framworks;

import java.util.*;

public class Order {
    int orderId;
    String customer;
    String category;
    double amount;

    public Order(int orderId, String customer, String category, double amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.category = category;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{#" + orderId + ", " + customer + ", " + category + ", ₹" + amount + "}";
    }
}