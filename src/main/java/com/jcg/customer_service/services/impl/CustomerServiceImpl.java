package com.jcg.customer_service.services.impl;

import com.jcg.customer_service.dtos.CustomerRequest;
import com.jcg.customer_service.dtos.CustomerResponse;
import com.jcg.customer_service.mappers.CustomerMapper;
import com.jcg.customer_service.models.Customer;
import com.jcg.customer_service.repositories.CustomerRepository;
import com.jcg.customer_service.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerResponse createCustomer(CustomerRequest dto) {
        Customer customer = customerMapper.toEntity(dto);
        Customer savedCustomer = customerRepository.save(customer);
        return customerMapper.toDto(savedCustomer);
    }

    @Override
    public CustomerResponse updateCustomer(Long id, CustomerRequest dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public CustomerResponse getCustomer(Long id) {

        Customer customer = customerRepository.findById(id).orElseThrow(()->new RuntimeException("Customer not found"));
        return customerMapper.toDto(customer);
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        return List.of();
    }
}
