package edu.iu.c322.orderservice.controller;

import edu.iu.c322.orderservice.Repository.CustomerRepository;
import edu.iu.c322.orderservice.Repository.InMemoryCustomerRepository;
import edu.iu.c322.orderservice.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class TrackingController {

    //get localhost:8080/customers
    private CustomerRepository repository;

    public TrackingController(CustomerRepository repository) {
        this.repository = repository;
    }

    //TRACKING COMMANDS
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @GetMapping("/trackings/{orderId}/{itemid}")
    public Tracking findStatus(@PathVariable int orderId, @PathVariable int itemid, int id) {
        InMemoryCustomerRepository myrepo = (InMemoryCustomerRepository) repository;
        return ((InMemoryCustomerRepository) repository).getCustomerbyId(id).getOrders().get(orderId).getItems().get(itemid).getTracking();
    }



    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/trackings/{itemid}")
    public void findTrackingdetail(@PathVariable int itemid, @PathVariable int id, @PathVariable int orderId, @RequestBody String status) {
        InMemoryCustomerRepository myrepo = (InMemoryCustomerRepository) repository;
        ((InMemoryCustomerRepository) repository).getCustomerbyId(id).getOrders().get(orderId).getItems().get(itemid).getTracking().setStatus(status);
    }
}







