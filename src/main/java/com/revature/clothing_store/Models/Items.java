package com.revature.clothing_store.Models;

import com.revature.clothing_store.Daos.ItemsDAO;

public class Items extends Outfit{
    public static int items_id;

    public Items(ItemsDAO itemsDAO) {

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
        return null;
    }

    @Override
    public String getPants() {
        return null;
    }

    @Override
    public String getShoes() {
        return null;
    }

    @Override
    public void setItems_id(Integer items_id) {

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

    @Override
    public void setShirts(String shirts) {

    }

    @Override
    public void setPants(String pants) {

    }

    @Override
    public void setShoes(String shoes) {

    }

    public Items() {
    }

    public Items(String color, String size, int price, String brand, String style) {
        super(color, size, price, brand, style);
    }
    public void removeItems() {

    }
}
