package edu.iu.c322.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Order {
    public int getOrderid() {
        return Orderid;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setPostalcode(int postalcode) {
        this.postalcode = postalcode;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getCustomerid() {
        return customerid;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public Item[] getItems() {
        return items;
    }

    public Order(String city, String state, int customerid, int postalcode) {

        this.city = city;

        this.state = state;

        this.customerid = customerid;

        this.postalcode = postalcode;
    }

    @NotEmpty(message = "city cannot be empty.")
    private String city;
    @NotEmpty(message = "state cannot be empty.")
    private String state;
    @NotEmpty(message = "customer id cannot be empty.")
    private int customerid;
    @NotEmpty(message = "postal code cannot be empty.")
    private int postalcode;

    @NotEmpty(message = "item list cannot be empty")
    private Item[] items;

    //autogenerate
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Orderid;
}
