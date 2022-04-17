package com.revature.clothing_store.UI;


import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Models.Customer;
import com.revature.clothing_store.Models.Items;
import com.revature.clothing_store.Services.CustomerService;

import java.util.Scanner;

public class LoginMenu implements IMenu {
    CustomersDAO customer = new CustomersDAO();
    private final CustomerService customerService;
    private final ItemsDAO ItemsDAO;
    private Customer Customer;
    private CustomersDAO CustomersDAO;

    public LoginMenu(CustomerService customerService, com.revature.clothing_store.Daos.ItemsDAO itemsDAO) {
        this.customerService = customerService;
        ItemsDAO = itemsDAO;
    }

    Scanner scanner = new Scanner(System.in);

    public LoginMenu(CustomerService customerService) {

        ItemsDAO = new ItemsDAO();
        this.customerService = customerService;
    }


    @Override
    public void start() {
        char input = ' ';


        boolean exit = false;


        exit:
        {
            while (true) {
                System.out.println("\nLog in or Create an Account");
                System.out.println("[1] Create an Account");
                System.out.println("[2] Log into Account");
                System.out.println("[x] Back to Homepage");
//Scanner
                input = scanner.next().charAt(0);


                switch (input) {

                    case '1':
                        createAccount();
                        System.out.println("Account Created Successfully");
                       // new ClothingStoreMenu(new Customer(new ItemsDAO())).start();
                        break;

                    case '2':

                        System.out.println("Continue to Shop");
                        new ClothingStoreMenu(new Items(new ItemsDAO())).start();
                        break;
                    case '3':
                        new LoginMenu(new CustomerService(new ItemsDAO())).start();
                        break exit;

                    default:
                        System.out.println("\nInvalid Selection");
                        break;
                }
            }
        }

}
    //private void login() {
   // }

    private boolean createAccount() {
        String username = "";
        String password1 = "";
        String firstname = "";
        String lastname = "";
        String address = "";
        String city = "";
        String state = "";
        int zipcode = ' ';

        //Scanner input = new Scanner(System.in);
        System.out.println("\nCreate an Account...");

        while (true) {

            while (true) {

                System.out.println("\nCreate username:");
                username = scanner.next();


                //if (!customerService()) {
                   if (customerService.isValidUsername(username)) {
                        customer.setUsername(username);
                        break;
                    } else {

                       System.out.println("Log in");
                       //new ClothingStoreMenu(new Items(new ItemsDAO())).start();
                       // System.out.println("\nInvalid username");

                       if (password1.equals(password1)) {
                           if (customerService.isValidPassword(password1)) {
                               String password = "";
                               customer.setPassword(password1);
                               break;
                    }
                }
                while (true) {
                    System.out.print("\nEnter password:");
                    password1 = scanner.next();
                    customer.setPassword(password1);

                    System.out.print("\nEnter First Name:");
                    firstname = scanner.next();
                    customer.setFirstname(firstname);

                    System.out.print("\nEnter Last Name:");
                    lastname = scanner.next();
                    customer.setLastname(lastname);

                    System.out.print("\nEnter Address:");
                    address = scanner.next();
                    customer.setAddress(address);

                    System.out.print("\nEnter City:");
                    city = scanner.next();
                    customer.setCity(city);

                    System.out.print("\nEnter State:");
                    state = scanner.next();
                    customer.setState(state);

                    System.out.print("\nEnter Zip code:");
                    zipcode = Integer.parseInt(scanner.next());
                    customer.setZipcode(zipcode);


                    if (password1.equals(password1)) {
                        if (customerService.isValidPassword(password1)) {
                            String password = "";
                            customer.setPassword(password1);
                            break;
                        /**} else {
                            System.out.println("\nInvalid password");
                        }
                    } else {
                        System.out.println("Password does not match!");
                    }*/
                        }
           }
                System.out.println("\nPlease confirm personal information (y/n)");
                System.out.print("Username: " + username);
                System.out.print("\nPassword: " + password1);
                System.out.print("\nFirst Name: "+ firstname);
                System.out.print("\nLast Name: "+ lastname);
                System.out.print("\nAddress: "+ address);
                System.out.print("\nCity: " + city);
                System.out.print("\nState: " + state);
                System.out.print("\nZip Code: " + zipcode);

                System.out.println("\nEnter: ");

                if (scanner.next().charAt(0) == 'y') {
                    // customerService.getCustomerDAO().save(Customer);
                    System.out.println("Account Created Successfully!");
                    break;
                }
                if (true) {
                   new AccountMenu().start();
                }

    }
               /**After account is created log in or go back to the homepage
                    while (true) {
                        System.out.println("\n[1]Log into New Account");
                        System.out.println("[2] Back to Homepage");

                        char input = scanner.next().charAt(0);


                        switch (input) {

                            case '1':
                                login();
                                System.out.println("\nAccount Created Successfully");
                                break;
                            case '2':
                                boolean exit = true;
                                break;

  }
 }
}
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
                            System.out.println("\nInvalid login go back");

        }
    }
}
}
}

    private void login() {
    }*/
         }

   }
 }
  }
}





