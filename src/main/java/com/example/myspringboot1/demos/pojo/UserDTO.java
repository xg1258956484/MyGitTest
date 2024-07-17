package com.example.myspringboot1.demos.pojo;

import java.util.List;

public class UserDTO {

    private int id;
//    City city;
    List<UserOrder> userOrders;


    public UserDTO() {}

    public UserDTO(int id, List<UserOrder> userOrders) {
        this.id = id;
        this.userOrders = userOrders;
    }
//    public UserDTO(List<UserOrder> userOrders) {
//        this.userOrders = userOrders;
//    }


//    public UserDTO(City city, List<UserOrder> userOrders) {
//        this.city = city;
//        this.userOrders = userOrders;
//    }

//    public City getCity() {
//        return city;
//    }
//
//    public void setCity(City city) {
//        this.city = city;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<UserOrder> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(List<UserOrder> userOrders) {
        this.userOrders = userOrders;
    }

//    public String toString() {
//        return "UserDTO{" +
//                "city=" + city +
//                ", userOrders=" + userOrders +
//                '}';
//    }
}
