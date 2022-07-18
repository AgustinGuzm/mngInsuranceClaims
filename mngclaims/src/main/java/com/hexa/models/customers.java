package com.hexa.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

		
		
		public customers() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public customers(Integer customerId, String firstName, String middleName, String lastName, String email,
				String phoneNumber, Boolean enrolled) {
			super();
			this.customerId = customerId;
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.enrolled = enrolled;
		}



		/**
		 * @return the customerId
		 */
		public Integer getCustomerId() {
			return customerId;
		}

		/**
		 * @param customerId the customerId to set
		 */
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the middleName
		 */
		public String getMiddleName() {
			return middleName;
		}

		/**
		 * @param middleName the middleName to set
		 */
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}

		/**
		 * @return the phoneNumber
		 */
		public String getPhoneNumber() {
			return phoneNumber;
		}

		/**
		 * @param phoneNumber the phoneNumber to set
		 */
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		/**
		 * @return the enrolled
		 */
		public Boolean getEnrolled() {
			return enrolled;
		}

		/**
		 * @param enrolled the enrolled to set
		 */
		public void setEnrolled(Boolean enrolled) {
			this.enrolled = enrolled;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((enrolled == null) ? 0 : enrolled.hashCode());
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
			result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			customers other = (customers) obj;
			if (customerId == null) {
				if (other.customerId != null)
					return false;
			} else if (!customerId.equals(other.customerId))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (enrolled == null) {
				if (other.enrolled != null)
					return false;
			} else if (!enrolled.equals(other.enrolled))
				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			if (middleName == null) {
				if (other.middleName != null)
					return false;
			} else if (!middleName.equals(other.middleName))
				return false;
			if (phoneNumber == null) {
				if (other.phoneNumber != null)
					return false;
			} else if (!phoneNumber.equals(other.phoneNumber))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "customers [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName
					+ ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", enrolled="
					+ enrolled + "]";
		}
	
		
}
