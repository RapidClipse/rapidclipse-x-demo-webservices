
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;
import com.rapidclipse.demo.webservices.domain.Supplier;


/**
 * Home object for domain model class Supplier.
 * 
 * @see Supplier
 */
public class SupplierDAO extends Default<Supplier, Integer>
{
	public final static SupplierDAO INSTANCE = new SupplierDAO();
	
	public SupplierDAO()
	{
		super(Supplier.class);
	}
}
