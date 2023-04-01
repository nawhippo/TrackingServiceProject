package edu.iu.c322.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import org.aspectj.apache.bcel.classfile.InnerClass;

import java.util.ArrayList;

public class Order {
    public ArrayList<Item> getItems() {
        return items;
    }

    ArrayList<Item> item;
    public Invoice getInvoice() {
        return invoice;
    }

    public Order(@NotEmpty(message = "item list cannot be empty") ArrayList<Item> items) {

        this.items = items;
    }

    public Order() {

    }


    Invoice invoice;
    public Order(String city, String state, int customerid, @NotEmpty ArrayList<Item> items, int postalcode, String currentdate) {
        this.items = items;
        this.address = new Address(state,city,postalcode);
        this.customerid = customerid;
        this.invoice = new Invoice(currentdate,this);
    }

    private int customerid;
    @NotEmpty(message = "postal code cannot be empty.")
    private int postalcode;

    @NotEmpty(message = "item list cannot be empty")
    private ArrayList<Item> items;
    private Address address;

    //autogenerate
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Orderid;

    public int getOrderid() {
        return this.Orderid;
    }
}
