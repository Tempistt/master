package com.revature.clothing_store.UI;

import com.revature.clothing_store.Daos.CartDAO;
import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Models.Cart;
import com.revature.clothing_store.Services.CartServices;
import com.revature.clothing_store.Services.ItemsService;

import java.util.Scanner;

public class CartMenu implements IMenu{
    public CartMenu(Cart cart) {


    }
    private Cart cart = new Cart();


    public CartMenu(CartServices cartServices) {
        this.cart = cart;
    }
    public CartMenu(int id, CartDAO cart) {

    }

    public CartMenu(CartServices cartServices, ItemsDAO itemsDAO) {

    }

    @Override
    public void start() {
        char input = ' ';

        boolean exit = false;

        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("\nAdd to Cart");

            System.out.println("\n[1] Choose your pants");
            System.out.println("\n[2] Choose your Shirt");
            System.out.println("\n[3] Choose your Shoes");
            System.out.println("\n[4] Check Order History");
            System.out.println("[5] Back to Homepage");

            System.out.println("\nCheck the items in your cart");
            input = scanner.next().charAt(0);


            switch (input) {

                case '1':
                    new ItemsMenu(new ItemsService(new CustomersDAO()), new ItemsDAO()).start();

                case '2' :
                    new ItemsMenu(new ItemsService(new CustomersDAO()), new ItemsDAO()).start();

                case '3' :
                    new ItemsMenu(new ItemsService(new CustomersDAO()), new ItemsDAO()).start();

                case '4' :
                    new OrderHistoryMenu(new ItemsService(new ItemsDAO()), new CartDAO()).start();

                case '5':
                    exit = true;
                    break;

                default:
                    System.out.println("\nItems Successfully Added to Cart!");
                    break;

            }
        }

    }
}
