
package com.revature.clothing_store.ClothingStore;


import com.revature.clothing_store.Connections.DatabaseConnections;
import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Services.CustomerService;
import com.revature.clothing_store.UI.MainMenu;

import java.sql.Connection;

public class Main {
    private static Object String;
    private static Object Outfit;
    private static Object Customer;
    private static Object ReviewService;
    private static Object ClothingStoreMenu;

    public static void main(String[] args) {


        new MainMenu(new CustomerService(new CustomersDAO())).start();


        Connection connection = DatabaseConnections.getConnection();

        System.out.println(connection);



    }

    }













