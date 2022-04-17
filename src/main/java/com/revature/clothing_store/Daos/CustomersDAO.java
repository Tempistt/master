package com.revature.clothing_store.Daos;

import com.revature.clothing_store.Connections.DatabaseConnections;
import com.revature.clothing_store.Models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomersDAO<userList> implements CrudDao<Customer> {


    Connection connection = DatabaseConnections.getConnection();
    private ResultSet ResultSet;


    @Override
    public Integer save(Customer customer) {
        int n = 0;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customers (username, password, firstname, lastname, address, city, state,zipcode) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");


            preparedStatement.setString(1, customer.getUsername());
            preparedStatement.setString(2, customer.getPassword());
            preparedStatement.setString(3, customer.getFirstname());
            preparedStatement.setString(4, customer.getLastname());
            preparedStatement.setString(5, customer.getAddress());
            preparedStatement.setString(6, customer.getCity());
            preparedStatement.setString(7, customer.getState());
            preparedStatement.setInt(8, customer.getZipcode());
            
            ResultSet = preparedStatement.executeQuery();
            
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

            return 0;
        }

       
        public List<Customer> findAll() {
            List<Customer> userList = new ArrayList<>();

            try {
                PreparedStatement ps = connection.prepareStatement("SELECT * FROM customers");
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Customer customer = new Customer();

                    customer.setId(rs.getInt("id"));
                    customer.setUsername(rs.getString("username"));
                    customer.setPassword(rs.getString("password"));

                    userList.add(customer);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


            return userList;

        }

    @Override
    public Customer findById(int id) {
        return findById(id) ;
    }

    @Override
    public List<Customer> findAllById(int id) {

        return findAllById(id);
    }

    @Override
    public boolean update(Customer updatedObj) {
        return false;
    }

    @Override
    public boolean removeById(String id) {
        return false;
    }
    public void add() {

    }

    public List<String> findAllUsernames() {
        return findAllUsernames();
    }

    public void setPassword(String password1) {
    }

    public void setFirstname(String firstname) {
    }

    public void setLastname(String lastname) {
    }

    public void setAddress(String address) {
    }

    public void setUsername(String username) {
    }

    public void setCity(String city) {
    }

    public void setState(String state) {
    }

    public void setZipcode(int zipcode) {
    }

    public Object getUsername() {

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM customers");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();

                customer.setId(rs.getInt("id"));
                customer.setUsername(rs.getString("username"));
                customer.setPassword(rs.getString("password"));

                return getUsername();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getUsername();
    }

    public Object getCustomerID(Object username) {
        return username;
    }

    public void setID(Object customerID) {
    }

    public void add(userList inventoryLocations) {
    }
}
