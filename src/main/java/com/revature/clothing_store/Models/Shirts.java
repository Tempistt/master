package com.revature.clothing_store.Models;

public class Shirts extends Outfit {

    public Shirts() {
    }

    public Shirts(String color, String size, int price, String brand, String style) {
        super(color, size, price, brand, style);
    }

    @Override
    public void start() {

    }

    @Override
    public int getItems_id() {
        return 0;
    }

    @Override
    public String getShirts() {
        return getShirts();
    }

    @Override
    public String getPants() {
        return getPants();
    }

    @Override
    public String getShoes() {
        return getShoes();
    }



    @Override
    public void setShirts(String shirts) {

    }

    @Override
    public void setPants(String pants) {

    }

    @Override
    public void setShoes(String shoes) {

    }

    @Override
    public void setItems_id(int items_id) {

    }

    @Override
    public void setItems_id(Integer items_id) {

    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setId(int items_id) {

    }

    //@Override
    //public void setId(Integer items_id) {

    //}

    public Shirts(Object outfit) {
    }



    @Override
    public String toString() {
        return "Shirts{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
