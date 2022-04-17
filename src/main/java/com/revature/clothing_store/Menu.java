package com.revature.clothing_store;

import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Services.CustomerService;
import com.revature.clothing_store.UI.LoginMenu;

public class Menu {
    public static void main(String[] args){

        new LoginMenu(new CustomerService(new CustomersDAO()), new ItemsDAO()).start();
    }
}
