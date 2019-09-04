
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.demo.webservices.domain.Customer;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;


/**
 * Home object for domain model class Customer.
 * 
 * @see Customer
 */
public class CustomerDAO extends Default<Customer, String>
{
	public final static CustomerDAO INSTANCE = new CustomerDAO();
	
	public CustomerDAO()
	{
		super(Customer.class);
	}
}
