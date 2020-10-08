package com.atm.demo.mapper;

import java.util.List;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;

import com.atm.demo.dtos.CustomerOrderDto;
import com.atm.demo.entities.CustomerOrder;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface CustomerOrderMapper {

	CustomerOrder convertDTOToEntity(CustomerOrderDto customerOrderDto);

	@InheritConfiguration
	CustomerOrder updateDTOToEntity(CustomerOrderDto customerOrderDto,
			@MappingTarget CustomerOrder customerOrder);

	@InheritInverseConfiguration(name = "convertDTOToEntity")
	CustomerOrderDto convertEntityToDTO(CustomerOrder customerOrder);
	
	List<CustomerOrder> convertDTOListToEntityList(List<CustomerOrderDto> customerOrderDtos);

    List<CustomerOrderDto> convertEntityListToDTOList(List<CustomerOrder> customerOrder);
}
