
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.demo.webservices.domain.Category;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;


/**
 * Home object for domain model class Category.
 * 
 * @see Category
 */
public class CategoryDAO extends Default<Category, Integer>
{
	public final static CategoryDAO INSTANCE = new CategoryDAO();
	
	public CategoryDAO()
	{
		super(Category.class);
	}
}
