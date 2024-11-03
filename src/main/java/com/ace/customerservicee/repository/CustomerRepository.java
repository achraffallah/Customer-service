package com.ace.customerservicee.repository;

import com.ace.customerservicee.entities.Customer;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.security.auth.login.AccountException;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findCustomerById(long id);
}
