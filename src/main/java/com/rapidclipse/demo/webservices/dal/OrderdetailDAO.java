
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.demo.webservices.domain.Orderdetail;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;
import com.rapidclipse.demo.webservices.domain.OrderdetailId;


/**
 * Home object for domain model class Orderdetail.
 * 
 * @see Orderdetail
 */
public class OrderdetailDAO extends Default<Orderdetail, OrderdetailId>
{
	public final static OrderdetailDAO INSTANCE = new OrderdetailDAO();
	
	public OrderdetailDAO()
	{
		super(Orderdetail.class);
	}
}
