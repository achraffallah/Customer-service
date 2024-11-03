package com.ace.customerservicee;

import com.ace.customerservicee.entities.Customer;
import com.ace.customerservicee.repository.CustomerRepository;
import com.ace.customerservicee.web.CustomerRestController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceeApplication {

    public static void main ( String[] args ) {
        SpringApplication.run ( CustomerServiceeApplication.class , args );
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {

        return args -> {

                customerRepository.save (Customer.builder ().name ( "X" ).email ( "X@gmail.com" ).build ()  );
                customerRepository.save (Customer.builder ().name ( "Y" ).email ( "Y@gmail.com" ).build ()  );
//test before the annotations

//            CustomerRestController customerRestController = new CustomerRestController();
//            customerRestController.customerRepository = customerRepository;
//
//            List<Customer> customers = customerRestController.customerList();
//            for ( Customer c: customers ) {
//                System.out.println (c.getName ());
//            }
//
//
//            Customer newCustomer = Customer.builder().name("Alice").email("alice@example.com").build();
//            Customer savedCustomer = customerRestController.saveCustomer(newCustomer);
//            System.out.println("Saved Customer: " + savedCustomer);
//
//            Customer retrievedCustomer = customerRestController.customerById(savedCustomer.getId());
//            System.out.println("Retrieved Customer: " + retrievedCustomer);
        };
    }
}
