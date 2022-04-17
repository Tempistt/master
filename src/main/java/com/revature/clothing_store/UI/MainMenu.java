package com.revature.clothing_store.UI;

import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Models.Customer;
import com.revature.clothing_store.Services.CustomerService;

import java.util.Scanner;

public class MainMenu implements IMenu {
    public MainMenu(Customer customer) {
        this.customer = customer;
    }
//private final CustomerService customerService;

    private Customer customer = new Customer();


   // public MainMenu(CustomerService customerService, Customer customer) {

        //this.customerService = customerService;

        //this.customer = customer;


    public MainMenu(CustomerService customerService) {
       // this.customerService = customerService;

        this.customer = customer;
    }

    public MainMenu(int id, CustomersDAO customer) {

    }

    //* public MainMenu(CustomerService customerService) {

  //  }

  //  public MainMenu(int id, CustomersDAO customer) {

   // }


    @Override
    public void start() {
        char input = ' ';


        boolean exit = false;

        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("\nWelcome to the Maven's Clothing" + "!");

            System.out.println("[1] Create an Account");
            System.out.println("[2] Log into Account");



            System.out.println("\nEnter Store");
            input = scanner.next().charAt(0);


            switch (input) {
                /**case '1':
                    new ClothingStoreMenu().start();
                    break;*/

                case '1':
                    new LoginMenu(new CustomerService(new ItemsDAO())).start();
                    break;
                case '2':
                    new ClothingStoreMenu(new Customer(new ItemsDAO())).start();
                    break;

                default:
                    System.out.println("\nAccount Created Successfully");
                    break;

            }


        }
    }




}

