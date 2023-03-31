package edu.iu.c322.orderservice.model;

import jakarta.validation.constraints.NotEmpty;

public class Item {
    @NotEmpty(message = "item must be specified.")
    private String name;
    @NotEmpty(message = "item quantity cannot be empty.")
    private int quantity;
    @NotEmpty(message = "item price cannot be empty.")
    private int price;




}
