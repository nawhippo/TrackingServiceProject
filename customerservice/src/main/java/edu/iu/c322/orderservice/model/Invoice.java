package edu.iu.c322.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Invoice{
    Order order;
    public void setShippingStatus(String status) {
        this.status = status;
    }

    public Invoice(String Orderplaceddate, Order order) {
        this.order = order;
        this.date = date;
        double sum = 0;
        for(int i = 0; i < items.size(); i++){
            sum = sum + order.getItems().get(i).getPrice() * order.getItems().get(i).getQuantity();
        }
        this.total = sum;
        this.items = order.getItems();
        this.paymentMethod = paymentMethod;
        this.address = address;
        this.id = id;
    }
    private String date;
private double total;
private ArrayList<Item> items;

private PaymentMethod paymentMethod;
private Address address;

private String status;


    @Id
    private Long id;

    public Invoice() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }




}
