package com.revature.clothing_store.Daos;

import com.revature.clothing_store.Connections.DatabaseConnections;
import com.revature.clothing_store.Models.InventoryLocations;
import com.revature.clothing_store.Services.InventoryService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InventorylocationsDAO<InventoryLocationslist> implements CrudDao<InventoryLocations>{

    Connection connection = DatabaseConnections.getConnection();
    private Integer InventoryLocationList;
    private InventoryService InventoryLocationsList;


    @Override
    public Integer save(InventoryLocations Integer) {

        Integer n = 0;



        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO inventorylocations (items_id, stock, location_id) VALUES (?, ?,?)");

            InventoryLocations integer = new InventoryLocations();
            preparedStatement.setInt(1, integer.getItems_id());
            preparedStatement.setInt(2, integer.getStock());
            preparedStatement.setInt(3, integer.getLocation_id());

        }catch (SQLException exception) {
            exception.printStackTrace();

        }


        return 0;
    }



    @Override
    public List<InventoryLocations> findAll() {
        List<InventoryLocations> inventoryLocations = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM inventorylocations");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                InventoryLocations inventorylocations = new InventoryLocations();

               // inventoryLocations.setId(rs.getInt("id"));
                inventorylocations.setId(rs.getInt("id"));
                inventoryLocations.equals(rs.getInt("items_id"));
                inventoryLocations.equals(rs.getInt("stock"));
                inventorylocations.equals(rs.getInt("location_id"));

                InventoryLocationsList.add(inventoryLocations);
            }
        }catch (SQLException exception) {
            exception.printStackTrace();

        }
        return findAll();
    }

    @Override
    public InventoryLocations findById(int id) {
        return findById(id);
    }

    @Override
    public List<InventoryLocations> findAllById(int id) {
        return findAllById(id);
    }

    @Override
    public boolean update(InventoryLocations updatedObj) {
        return false;
    }





    @Override
    public boolean removeById(String id) {
        return false;
    }
}
