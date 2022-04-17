package com.revature.clothing_store.UI;

import com.revature.clothing_store.Daos.CartDAO;
import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Daos.OrderhistorysDAO;
import com.revature.clothing_store.Models.Cart;
import com.revature.clothing_store.Models.Customer;
import com.revature.clothing_store.Models.Items;
import com.revature.clothing_store.Services.CartServices;
import com.revature.clothing_store.Services.ItemsService;

import java.util.Scanner;

public class OrderHistoryMenu implements IMenu {

    public  Items items;

    public OrderHistoryMenu(Items items) {
        this.items = items;
    }

    private Customer customer = new Customer();
    private Cart cart = new Cart();

    public OrderHistoryMenu(ItemsService itemsService, CartDAO cartDAO) {

    }

    private void CartMenu(CartServices cartServices) {
        this.cart = cart;
    }

    private void CartMenu(int id, OrderhistorysDAO orderhistory) {

    }

    @Override
    public void start() {
        char input = ' ';


        boolean exit = false;

        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("\nItems you've purchased");

            System.out.println("[1] Order Again");
            System.out.println("[2] Add more to your cart");
            System.out.println("[3] Back to Homepage");


            System.out.println("\nKeep Shopping");
            input = scanner.next().charAt(0);


            switch (input) {

                case '1':
                    new ItemsMenu(new ItemsService(new CustomersDAO()), new ItemsDAO()).start();

                case '2' :
                    new CartMenu(new CartServices(new CartDAO()),new ItemsDAO()).start();

                case '3' :
                    exit = true;
                    break;

                default:
                    System.out.println("\nContinue Shopping");
                    break;
            }

        }


    }
}





