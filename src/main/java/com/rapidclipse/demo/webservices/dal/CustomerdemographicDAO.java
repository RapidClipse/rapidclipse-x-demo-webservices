
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.demo.webservices.domain.Customerdemographic;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;


/**
 * Home object for domain model class Customerdemographic.
 * 
 * @see Customerdemographic
 */
public class CustomerdemographicDAO extends Default<Customerdemographic, String>
{
	public final static CustomerdemographicDAO INSTANCE = new CustomerdemographicDAO();
	
	public CustomerdemographicDAO()
	{
		super(Customerdemographic.class);
	}
}
