package com.jcg.customer_service.mappers;

import com.jcg.customer_service.dtos.CustomerRequest;
import com.jcg.customer_service.dtos.CustomerResponse;
import com.jcg.customer_service.models.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public CustomerResponse toDto(Customer customer) {
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setFirstName(customer.getFirstName());
        customerResponse.setLastName(customer.getLastName());
        customerResponse.setId(customer.getId());
        customerResponse.setEmail(customer.getEmail());
        customerResponse.setCreatedAt(customer.getCreatedAt());
        customerResponse.setUpdatedAt(customer.getUpdatedAt());
        return customerResponse;
    }
    public Customer toEntity(CustomerRequest dto) {

        Customer customer = new Customer();
        customer.setFirstName(dto.getFirstName());
        customer.setLastName(dto.getLastName());
        customer.setEmail(dto.getEmail());

        return customer;

    }

}
