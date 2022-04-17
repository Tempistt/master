package com.revature.clothing_store.Models;

import com.revature.clothing_store.Daos.CustomersDAO;
import com.revature.clothing_store.Daos.ItemsDAO;

import java.util.Scanner;

public class Customer {
    private static Object Customer;
    private int id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private int zipcode;

    public Customer() {
    }

    public Customer (int id, String username, String password, String firstname,String lastname, String address, String city, String state, int zipcode) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;

    }

    public Customer(ItemsDAO itemsDAO) {

    }

    public Customer(CustomersDAO customerDAO) {

    }



    public Customer(String itemsDAO) {

    }

    public Customer(int customerId) {

    }

    public static Scanner getCustomerDAO() {
        return (Scanner) Customer;
    }

    public int getId(Customer customer) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Username : " + username;
    }

    public void add() {
    }
}


