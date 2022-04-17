package com.revature.clothing_store.Daos;

import com.revature.clothing_store.Connections.DatabaseConnections;
import com.revature.clothing_store.Models.OrderHistory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderhistorysDAO implements CrudDao<OrderHistory> {

    Connection connection = DatabaseConnections.getConnection();
    private Object OrderHistory;
    private Object ResultSet;



        @Override
        public String save(OrderHistory obj) {
            String n = "";



            try {
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO orderhistorys (items_id, location, date) VALUES (?, ?, ?)");

                preparedStatement.setInt(1, obj.getItems_id());
                preparedStatement.setString(2, obj.getLocation());
                preparedStatement.setInt(3, obj.getDate());

                ResultSet = preparedStatement.executeQuery();

            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            return n;
        }


    @Override
    public List<OrderHistory> findAll() {
        List<OrderHistory> orderHistoryList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM orderhistorys");
            ResultSet rs =preparedStatement.executeQuery();

            while (rs.next()) {
                OrderHistory orderHistory = new OrderHistory();

                orderHistory.setId(rs.getInt("id"));
                orderHistory.setItems_id(rs.getInt("items_id"));
                orderHistory.setLocation(rs.getString("location"));
                orderHistory.setDate(rs.getInt("date"));

                orderHistoryList.add((OrderHistory) OrderHistory);
            }
        }catch (SQLException e) {
            e.printStackTrace();
 }
        return findAll();
    }

    @Override
    public OrderHistory findById(int id) {
        return findById(id);
    }

    @Override
    public List<OrderHistory> findAllById(int id) {
        return findAllById(id);
    }

    @Override
    public boolean update(OrderHistory updatedObj) {
        return false;
    }

    @Override
    public boolean removeById(String id) {
        return false;
    }
}

