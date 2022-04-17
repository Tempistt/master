package com.revature.clothing_store.Models;


public abstract class Outfit {
    protected String color;
    protected String size;
    protected int price;
    protected String brand;
    protected String style;


    public Outfit() {
    }

    public Outfit(String color, String size, int price, String brand, String style) {
        this.color = color;
        this.size = size;
        this.price = price;
        this.brand = brand;
        this.style = style;

    }


    public abstract void start();



    public abstract String getShirts();

    public abstract String getPants();

    public abstract String getShoes();


    public abstract void setItems_id(Integer items_id);

    public abstract void setShirts(String shirts);

    public abstract void setPants(String pants);

    public abstract void setShoes(String shoes);

    public abstract void setItems_id(int items_id);

    public abstract int getPrice();

    public abstract void setId(int items_id);

    public abstract int getItems_id();
}



