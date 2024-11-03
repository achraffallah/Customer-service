package com.ace.customerservicee.web;

import com.ace.customerservicee.entities.Customer;
import com.ace.customerservicee.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {
    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping
    public List<Customer> customerList(){
        return customerRepository.findAll ();
    }
    @GetMapping("/{id}")
    public Customer customerById(Long id ){
        return customerRepository.findById ( id ).orElse ( null ) ;
    }
    @PostMapping

    public Customer saveCustomer(Customer customer){
        return customerRepository.save ( customer );
    }
}
