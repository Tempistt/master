package com.revature.clothing_store.Services;

import com.revature.clothing_store.Daos.InventorylocationsDAO;
import com.revature.clothing_store.Daos.ItemsDAO;
import com.revature.clothing_store.Models.InventoryLocations;

import java.util.List;

public class InventoryService {

    private final InventorylocationsDAO inventorylocationsDAO;

    public InventoryService(InventorylocationsDAO inventorylocationsDAO) {
        this.inventorylocationsDAO = inventorylocationsDAO;
    }
    public void getInventorylocationsDAO() {

    }
    private ItemsDAO itemsDAO = new ItemsDAO();

    public InventoryService(InventorylocationsDAO inventorylocationsDAO, ItemsDAO itemsDAO) {
        this.inventorylocationsDAO = inventorylocationsDAO;
        this.itemsDAO = itemsDAO;
    }
    public ItemsDAO getItemsDAO() {return itemsDAO;

    }
    public void add(List<InventoryLocations> inventoryLocations){

    }
}

