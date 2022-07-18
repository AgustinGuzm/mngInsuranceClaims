package com.hexa.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hexa.models.customers;

public interface CustomerRepository extends JpaRepository<customers, Integer>{

}
