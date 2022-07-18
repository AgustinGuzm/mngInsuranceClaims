package com.hexa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hexa.definitions.CustomerServiceDefinition;
import com.hexa.models.customers;
import com.hexa.repository.CustomerRepository;

@Service
public class CustomerService implements CustomerServiceDefinition{
	@Autowired
	CustomerRepository repo;
	//private String rootAPI = "/api/v1/";
	
	@Override
	public customers createCustomer(customers c) {
		 return repo.save(c);
		 
			//customers newCustomer = repo.save(c);
			//newCustomer.setUrl(rootAPI+"claim/"+newCustomer.getCustomerId());
			//return repo.save(newCustomer);
	}

	@Override
	public customers updateCustomer(customers c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customers> showAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public customers showCuctomerById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customers> filterCuctomer(String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customers> sortingCustomer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//private String rootAPI = "/api/v1/";
	
//	@Autowired
//	private CustomerRepository customerRepositoy;
	
//	public List<customers> ListAllCustomer(){
//		List<customers> lstcstmrs;
//		lstcstmrs= service.ListAllCustomer();
//		return repo.findAll();
//	}
	
//	public List<customersController> ListAllCustomer(){
//        
//		return repo.findAll();
//	}

}
