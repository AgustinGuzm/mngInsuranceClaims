package com.hexa.definitions;

import java.util.List;

import com.hexa.models.customers;

public interface CustomerServiceDefinition {
	public customers createCustomer(customers c);
	
	public customers updateCustomer(customers c);
		
	public List<customers> showAllCustomers();
	public customers showCuctomerById(Integer id);
	
	public List<customers> filterCuctomer(String keywords);
	public List<customers> sortingCustomer();

}
