package edu.iu.c322.orderservice.model;

public class PaymentMethod {
    public PaymentMethod(String method, int number, Address address) {
        this.method = method;
        this.number = number;
        this.address = address;
    }

    String method;
    int number;
    Address address;
}
