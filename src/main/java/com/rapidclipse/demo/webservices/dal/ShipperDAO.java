
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.demo.webservices.domain.Shipper;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;


/**
 * Home object for domain model class Shipper.
 * 
 * @see Shipper
 */
public class ShipperDAO extends Default<Shipper, Integer>
{
	public final static ShipperDAO INSTANCE = new ShipperDAO();
	
	public ShipperDAO()
	{
		super(Shipper.class);
	}
}
