package com.revature.clothing_store.UI;

import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Models.*;
import com.revature.clothing_store.Services.ItemsService;

import java.util.Scanner;

public class ItemsMenu extends Outfit {


    private Object Outfit;

    public ItemsMenu(Shirts shirts, Shoes shoes, Pants pants) {

    }

    public ItemsMenu(String save) {

    }

    public ItemsMenu(String color, String size, int price, String brand, String style) {
        super(color, size, price, brand, style);
    }

    public ItemsMenu(Customer save) {
    }


    public ItemsMenu() {

    }

    public ItemsMenu(ItemsDAO itemsDAO) {

    }

    public ItemsMenu(ItemsService itemsService, ItemsDAO itemsDAO) {

    }

    @Override
    public void start() {
        char input = ' ';

        boolean exit = false;

        Scanner scanner = new Scanner(System.in);


        while (!exit) {
            System.out.println("[1] Pants");
            System.out.println("[2] Shirts");
            System.out.println("[3] Shoes");
            System.out.println("[x] Back to Homepage");


            System.out.println("\nPick your Outfit");
            input = scanner.next().charAt(0);


            switch (input) {
                case '1':
                    new ItemsDAO().start();
                    break;
                case '2':
                    new ItemsDAO().start();
                    break;
                case '3':
                    new ItemsDAO().start();
                    break;

                case 'x':
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid Selection");
                    break;


            }
        }
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
}