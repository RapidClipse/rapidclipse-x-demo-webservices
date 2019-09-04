
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.demo.webservices.domain.Order;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;


/**
 * Home object for domain model class Order.
 * 
 * @see Order
 */
public class OrderDAO extends Default<Order, Integer>
{
	public final static OrderDAO INSTANCE = new OrderDAO();
	
	public OrderDAO()
	{
		super(Order.class);
	}
}
