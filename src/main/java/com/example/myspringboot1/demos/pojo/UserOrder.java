package com.example.myspringboot1.demos.pojo;

public class UserOrder {
    private int id;
    private int orderId;
    private String orderName;

    public UserOrder(int id, int orderId, String orderName) {
        this.id = id;
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
