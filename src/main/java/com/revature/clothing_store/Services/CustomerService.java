package com.revature.clothing_store.Services;


import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Models.Customer;

import java.util.List;

public class CustomerService {

    private  CustomersDAO customerDAO = new CustomersDAO<>();

    public CustomerService(CustomersDAO customerDAO) {
        this.customerDAO = customerDAO;
        this.itemsDAO = itemsDAO;
    }

    public CustomerService(ItemsDAO itemsDAO) {

      CustomersDAO  customerDAO = new CustomersDAO();
        customerDAO = new CustomersDAO<>();
        customerDAO = new CustomersDAO<>();
    }

    public CustomersDAO getCustomerDAO() {
        return customerDAO;
    }

    private  ItemsDAO itemsDAO = new ItemsDAO();

    public CustomerService(CustomersDAO customerDAO, ItemsDAO itemsDAO) {
        this.customerDAO = customerDAO;
        this.itemsDAO = itemsDAO;
    }

    public ItemsDAO getItemsDAO() {
        return itemsDAO;
    }

    public void add() {
    }
    //public boolean isDuplicateUsername(String username) {
       // List<String> usernames = customerDAO.findAllUsernames();

        //for (String u : usernames) {
            //if (u.equals(username)) {
                //return true;

           // }
        //}
       // return false;
   // }
    public boolean isValidUsername(String username) {
        return username.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,20}$");
    }
    public boolean isValidPassword(String password) {
        return password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@]).{8,20}$");
    }
    public boolean isValidLogin(Customer customer) {
        List<Customer> List = customerDAO.findAll();

        //for (Customer i : List)

        {
            //Customer i = new Customer();
           // return i.getUsername().equals(Customer.getUsername()) && i.getPassword().equals(Customer.getPassword());

        }
        return false;
    }


    public void start() {
    }
}


