package com.revature.clothing_store.Services;

import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Models.Items;

public class ItemsService {

    public Items items;
    public ItemsDAO ItemsDAO;
    public CustomersDAO customerDAO;


    public ItemsService(Items items, ItemsDAO itemsDAO, CustomersDAO customerDAO) {
        this.items = items;
        this.ItemsDAO = itemsDAO;
        this.customerDAO = customerDAO;

    }

    public ItemsService(CustomersDAO customersDAO, ItemsDAO itemsDAO, Items items, com.revature.clothing_store.Daos.ItemsDAO itemsDAO1, CustomersDAO customerDAO) {
        this.items = items;
        ItemsDAO = itemsDAO1;
        this.customerDAO = customerDAO;
    }

    public ItemsService(CustomersDAO customersDAO) {
        
    }

    public ItemsService(com.revature.clothing_store.Daos.ItemsDAO itemsDAO) {
    }

    public ItemsDAO getItemsDAO() {
        com.revature.clothing_store.Daos.ItemsDAO customerDAO = new ItemsDAO();
        return customerDAO;}

    public void add() {

    }
}
