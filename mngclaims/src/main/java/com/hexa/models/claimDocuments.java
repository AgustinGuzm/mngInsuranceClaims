package com.hexa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="claimDocuments")
public class claimDocuments {
	
	   // Define fields to use in the table
		@Id //primary key for documents that belong to a claim
		@GeneratedValue(strategy=GenerationType.IDENTITY) //auto generate the value for claimDocuemntId
		private Integer claimDocumentId; //Id to identify the claimDocument
		
		@ManyToOne
		@JoinColumn(name="claimsId")
		private customers claims;
		
		@Column(name="claimDocumentPath", length = 250)
		private String claimDocumentPath;
		

}
