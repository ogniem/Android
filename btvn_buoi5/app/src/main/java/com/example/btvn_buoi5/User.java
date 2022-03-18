package com.example.btvn_buoi5;

public class User {
    private int resourceId;
    private String sector;
    private String name;
    private String price;

    public User(int resourceId, String sector, String name, String price) {
        this.resourceId = resourceId;
        this.sector = sector;
        this.name = name;
        this.price = price;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
