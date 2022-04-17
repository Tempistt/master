package com.revature.clothing_store.UI;


import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Models.Customer;
import com.revature.clothing_store.Models.Items;
import com.revature.clothing_store.Services.CustomerService;

import java.util.Scanner;

public class ClothingStoreMenu implements IMenu{
    public ClothingStoreMenu(ItemsDAO itemsDAO) {

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private  Customer customer;

    public ClothingStoreMenu(Customer customer) {
        super();
        this.customer = customer;

    }
    public ClothingStoreMenu() {
        super();
    }



    public ClothingStoreMenu(CustomerService customerService) {

        }

    public ClothingStoreMenu(Items items) {

    }

    @Override
        public void start() {
            char input = ' ';


            boolean exit = false;

            Scanner scanner = new Scanner(System.in);

            while (!exit) {
                System.out.println("\nChoose your options" + "!");
                System.out.println("[1] Go to Outfits");
                System.out.println("[2] Back to Homepage");


                System.out.println("\nAdd to your cart");
                input = scanner.next().charAt(0);


                switch (input) {
                    case '1':
                        new ItemsMenu().start();
                        break;

                    case '2':
                        new LoginMenu(new CustomerService(new ItemsDAO())).start();
                        exit = true;
                        break;
                    default:
                        System.out.println("\nInvalid Selection");
                        break;

                }


            }
        }
    }




