package edu.iu.c322.orderservice.Repository;

import edu.iu.c322.orderservice.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
