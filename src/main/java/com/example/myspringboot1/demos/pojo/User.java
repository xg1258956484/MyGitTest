package com.example.myspringboot1.demos.pojo;

/**
 * @author xieGang
 * @description
 * @date 2024/4/28 下午1:07
 **/
public class User {
    private int id;
    private String name;
    private int age;
    private String address;
    private String phone;
    private String passWord;
    private int cityId;
    private int orderId;


    public User() {
    }

    public User(int id, String name, int age, String address, String phone, String passWord, int cityId, int orderId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.passWord = passWord;
        this.cityId = cityId;
        this.orderId = orderId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", passWord='" + passWord + '\'' +
                ", cityId=" + cityId +
                ", orderId=" + orderId +
                '}';
    }
}
