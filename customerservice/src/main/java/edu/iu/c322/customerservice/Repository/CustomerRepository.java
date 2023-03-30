package edu.iu.c322.customerservice.Repository;

import edu.iu.c322.customerservice.model.Customer;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
