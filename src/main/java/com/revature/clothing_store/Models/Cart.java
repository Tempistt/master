package com.revature.clothing_store.Models;

import com.revature.clothing_store.Daos.CartDAO;

public class Cart {

    public int items_id
            ;

    public Cart(int itemsid, int id, int price, String pants, String shirts, String shoes, int stock) {
        this.itemsid = itemsid;
        this.id = id;
        this.price = price;
        this.pants = pants;
        this.shirts = shirts;
        this.shoes = shoes;
        this.stock = stock;
    }

    //shopping cart variables
    public int id;
    public int price;
    public String pants;
    public String shirts;
    public String shoes;
    public int stock;


    public Cart(CartDAO CartDAO) {


    }

    public int itemsid;

    public Cart() {

    }

    public int getItemsid() {
        return itemsid;
    }

    public void setItemsid(int itemsid) {
        this.itemsid = itemsid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getShirts() {
        return shirts;
    }

    public void setShirts(String shirts) {
        this.shirts = shirts;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public int hashCode() {
        int hash = 20;

        Object obj = new Object();


        return super.hashCode();
    }


    public int getCustomerid() {
        return getCustomerid();
    }

    public char getItems() {
        return 0;
    }
}
