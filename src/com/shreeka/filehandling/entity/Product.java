/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.filehandling.entity;

/**
 *
 * @author Decode
 */
public class Product {
    
    private int id;
    private String name;
    private int quantity;
    private double price;
    private boolean status;

    public Product() {
    }

    
    
    public Product(int id, String name, int quantity, double price, boolean status) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
