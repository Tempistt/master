package com.revature.clothing_store.Models;

public class ClothingStore {
    private int id;
    private String shirts;
    private String pants;
    private String shoes;
    public int price;
    public int location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShirts() {
        return shirts;
    }

    public void setShirts(String shirts) {
        this.shirts = shirts;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public ClothingStore() {
    }

    public static void findAll() {
    }



    public ClothingStore(int id, String shirts, String pants, String shoes, int price, int location) {
        this.id = id;
        this.shirts = shirts;
        this.pants = pants;
        this.shoes = shoes;
        this.price = price;
        this.location = location;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void start() {
    }
}

