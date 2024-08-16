package com.adamoubello.brewery.web.mappers;

import com.adamoubello.brewery.domain.Customer;
import com.adamoubello.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
