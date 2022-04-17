package com.revature.clothing_store.Models;

public class InventoryLocations {



    private Integer id;
    private Integer items_id;
    private Integer stock;
    private Integer location_id;





    public InventoryLocations(Integer id, Integer items_id, Integer stock, Integer location_id) {
        this.id = id;
        this.items_id = items_id;
        this.stock = stock;
        this.location_id = location_id;
    }

    public InventoryLocations() {

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }





    }

