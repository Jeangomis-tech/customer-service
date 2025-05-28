package com.jcg.customer_service.repositories;

import com.jcg.customer_service.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
