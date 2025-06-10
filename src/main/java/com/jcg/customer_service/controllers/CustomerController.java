package com.jcg.customer_service.controllers;

import com.jcg.customer_service.dtos.CustomerRequest;
import com.jcg.customer_service.dtos.CustomerResponse;
import com.jcg.customer_service.models.Customer;
import com.jcg.customer_service.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest dto) {
        CustomerResponse customerResponse = customerService.createCustomer(dto);
        return new ResponseEntity<>(customerResponse, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable Long id) {
        CustomerResponse customerResponse = customerService.getCustomer(id);
        return new ResponseEntity<>(customerResponse, HttpStatus.OK);

    }
    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers() {

        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

}
