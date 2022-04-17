package com.revature.clothing_store.UI;

import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Models.Customer;
import com.revature.clothing_store.Services.CustomerService;

import java.util.Scanner;

public class AccountMenu implements IMenu {
    CustomersDAO customer = new CustomersDAO();
    private Object CustomerService;
    private CustomerService customerService = (CustomerService) CustomerService;
    private ItemsDAO ItemsDAO;
    private Customer Customer;
    private CustomersDAO CustomersDAO;
    private Object AccountMenu;
    private Object Items;

    public AccountMenu(CustomerService customerService, ItemsDAO itemsDAO) {
        this.customerService = customerService;
        ItemsDAO = itemsDAO;
    }

    Scanner scanner = new Scanner(System.in);


    public AccountMenu(CustomerService customerService) {

        ItemsDAO = new ItemsDAO();
        this.customerService = customerService;

    }

    public AccountMenu() {

    }

    @Override
    public void start() {
        char input = ' ';


        boolean exit = false;


        exit:
        {


            while (true) {
                System.out.println("\n[1]Log into New Account");
                System.out.println("\n[2] Back to Homepage");

                input = scanner.next().charAt(0);


                switch (input) {

                    case '1':
                        new AccountMenu();
                        System.out.println("\n");
                        break;
                    case '2':
                        exit = true;
                        break;
                }

                while (true) {
                    System.out.print("\nUsername: ");
                    customer.setUsername(scanner.next());

                    System.out.print("\nPassword: ");
                    customer.setPassword((scanner.next()));

                    if (customerService.isValidLogin(Customer)) {
                        customer = customerService.getCustomerDAO();
                        customer.setID(customerService.getCustomerDAO().getCustomerID(customer.getUsername()));
                        new ClothingStoreMenu(new Customer(new ItemsDAO())).start();
                        //new MainMenu(new Customer(customer).getId(Customer), customer).start();

                        break;
                    } else {
                        new LoginMenu(new CustomerService(new ItemsDAO())).start();
                        System.out.println("\nInvalid login go back");
                        break;


                        }
                    }
                    }
                }
            }
        }






