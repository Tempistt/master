package com.revature.clothing_store.Models;

public class Pants extends Outfit {
    public Pants() {
    }

    public Pants(String color, String size, int price, String brand, String style) {
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
    public void setItems_id(Integer items_id) {

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
    public int getPrice() {
        return 0;
    }

    @Override
    public void setId(int items_id) {

    }


    //@Override
    //public void setId(Integer id) {

   // }

    public Pants(Object outfit) {
    }

    @Override
    public String toString() {
        return "Pants{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
