package com.enoque.produt_registration;

import java.util.Date;

public class Product {
    private  String name;
    private  double price;
    private  int validity;
    private  int quantity;

    public Product(String name, double price, int validity, int quantity) {
        this.name = name;
        this.price = price;
        this.validity = validity;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
