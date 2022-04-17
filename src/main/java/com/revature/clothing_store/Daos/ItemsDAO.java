package com.revature.clothing_store.Daos;

import com.revature.clothing_store.Connections.DatabaseConnections;
import com.revature.clothing_store.Models.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemsDAO implements CrudDao<Items> {

    Connection connection = DatabaseConnections.getConnection();
    private Object List;
    private Object Items;

    public ItemsDAO(Object items) {

    }

    public ItemsDAO() {

    }


    @Override
    public String save(Items obj) {
        String n = "";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO items (items_id, shirts, pants, shoes, price) VALUES (?. ?, ?, ?, ?)");

            preparedStatement.setInt(1, obj.getItems_id());
            preparedStatement.setString(2, obj.getShirts());
            preparedStatement.setString(3, obj.getPants());
            preparedStatement.setString(4, obj.getShoes());
            preparedStatement.setInt(5, obj.getPrice());

        } catch (SQLException exception) {
            exception.printStackTrace();

        }
        return n;

    }

    @Override
    public List<Items> findAll() {
        List<Items> itemsList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM items");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Items items = new Items();

                items.setId(rs.getInt("items_id"));
                items.setShirts(rs.getString("Shirts"));
                items.setPants(rs.getString("Pants"));
                items.setShoes(rs.getString("Shoes"));

                itemsList.add(new Items());
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return itemsList;
    }

    @Override
    public Items findById(int items_id) {
        Items items = new Items();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM items WHERE items_id");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                items.setItems_id(rs.getInt("items_id"));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            return items;
        }

        new Customer();
        return items;
    }

    @Override
    public java.util.List<com.revature.clothing_store.Models.Items> findAllById(int id) {
        return findAllById(id);
    }

    @Override
    public boolean update(com.revature.clothing_store.Models.Items updatedObj) {
        return false;
    }

    @Override
    public boolean removeById(String id) {
        return false;
    }

    public void start() {
    }
}




