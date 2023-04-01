package edu.iu.c322.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import org.aspectj.apache.bcel.classfile.InnerClass;

public class Order {
    public Invoice getInvoice() {
        return invoice;
    }

    public Order(@NotEmpty(message = "item list cannot be empty") Item[] items) {

        this.items = items;
    }

    public Order() {

    }

    public Item[] getItems() {
        return items;
    }

    Invoice invoice;
    public Order(String city, String state, int customerid, @NotEmpty Item[] items, int postalcode, String currentdate) {
        this.items = items;
        this.address = new Address(state,city,postalcode);
        this.customerid = customerid;
        this.invoice = new Invoice(currentdate,this);
    }

    private int customerid;
    @NotEmpty(message = "postal code cannot be empty.")
    private int postalcode;

    @NotEmpty(message = "item list cannot be empty")
    private Item[] items;
    private Address address;

    //autogenerate
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Orderid;

    public int getOrderid() {
        return this.Orderid;
    }
}
