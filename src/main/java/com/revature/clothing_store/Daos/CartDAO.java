package com.revature.clothing_store.Daos;

import com.revature.clothing_store.Connections.DatabaseConnections;
import com.revature.clothing_store.Models.Cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDAO implements CrudDao<Cart> {
    Connection connection = DatabaseConnections.getConnection();



    @Override
    public String save(Cart obj) {
        String n = "";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO carts (id, itemsid, price) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, obj.getCustomerid());
            preparedStatement.setInt(2, obj.getItems());
            preparedStatement.setInt(3, obj.getPrice());

        }catch (SQLException exception) {
            exception.printStackTrace();
        }
        return n;


    }

    @Override
    public List<Cart> findAll(){
        List<Cart> cartList = new ArrayList<>();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM carts");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Cart Cart = new Cart();

                Cart.equals(rs.getInt("id"));
                Cart.equals(rs.getInt("items_id"));
                Cart.equals(rs.getInt("price"));



                cartList.add(Cart.items_id, cartList.remove(Cart.items_id));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return cartList;
        }

    @Override
    public Cart findById(int id) {
        return findById(id);
    }

    @Override
    public List<Cart> findAllById(int id) {
        return findAllById(id);
    }

    @Override
    public boolean update(Cart updatedObj) {
        return false;
    }

    @Override
    public boolean removeById(String id) {
        return false;
    }
}
