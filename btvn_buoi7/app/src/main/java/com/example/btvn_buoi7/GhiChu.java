package com.example.btvn_buoi7;

public class GhiChu {
    int id;
    String nd;

    public GhiChu() {
    }

    public GhiChu(int id, String nd) {
        this.id = id;
        this.nd = nd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }
}
