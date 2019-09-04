
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;
import com.rapidclipse.demo.webservices.domain.Product;


/**
 * Home object for domain model class Product.
 * 
 * @see Product
 */
public class ProductDAO extends Default<Product, Integer>
{
	public final static ProductDAO INSTANCE = new ProductDAO();
	
	public ProductDAO()
	{
		super(Product.class);
	}
}
