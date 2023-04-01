package edu.iu.c322.orderservice.model;

public class Tracking {
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Tracking(Item item, String status, String date) {
        this.item = item;
        this.status = status;
        this.date = date;
    }

    private Item item;
    private String status;
    private String date;

}
