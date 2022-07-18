package com.hexa.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class customers {

	   // Define fields to use in the table
		@Id //primary key for customerId
		@GeneratedValue(strategy=GenerationType.IDENTITY) //auto generate the value for id
		private Integer customerId; //Id to identify the customer
		
		@Column(name="FisrtName",nullable = false, length = 25)
		private String firstName; //customer first name
		
		@Column(name="MiddletName",nullable = true, length = 20)
		private String middleName;//customer middle name
		
		@Column(name="LastName",nullable = false, length = 25)
		private String lastName;//customer last name
		
		@Column(name="EmailAddress",nullable=false, length = 40)//, unique=true)
		private String email;//customer email address
		
		@Column(name="PhoneNumber",nullable=false, length = 10)
		private String phoneNumber;//customer phone number
		
		@Column(name="Enrolled")
		private Boolean enrolled; // define is enrolled is active (true) or not enrolled(false)	
	
}
