package edu.iu.c322.customerservice.controller;

import edu.iu.c322.customerservice.Repository.CustomerRepository;
import edu.iu.c322.customerservice.model.Customer;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    //get localhost:8080/customers
    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Customer> findAll(){

        return repository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public int create(@Valid @RequestBody Customer customer){
        Customer newCustomer = repository.save(customer);
        return newCustomer.getId();
    }

    //Put localhost:800/customers/2
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@Valid @RequestBody Customer customer, @PathVariable int id){
        customer.setId(id);
        repository.save(customer);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        Customer customer = new Customer();
        customer.setId(id);
        repository.delete(customer);
    }
}
