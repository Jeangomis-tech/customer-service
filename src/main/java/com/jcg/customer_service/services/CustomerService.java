package com.jcg.customer_service.services;

import com.jcg.customer_service.dtos.CustomerRequest;
import com.jcg.customer_service.dtos.CustomerResponse;
import com.jcg.customer_service.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService{
    CustomerResponse createCustomer( CustomerRequest dto );
   CustomerResponse updateCustomer( Long id,CustomerRequest dto );
   void delete( Long id );
   CustomerResponse getCustomer( Long id );
   List<CustomerResponse> getAllCustomers();
}
