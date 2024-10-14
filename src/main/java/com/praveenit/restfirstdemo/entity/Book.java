package com.praveenit.restfirstdemo.entity;

public class Book {
    private int id;
    private String name;
    private Double cost;
    public Book() {
    }
    public Book(int id, String name, Double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Double getCost() {
        return cost;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", cost=" + cost + "]";
    }
    


   
    
}
