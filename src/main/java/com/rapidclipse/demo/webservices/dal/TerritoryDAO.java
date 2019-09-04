
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.demo.webservices.domain.Territory;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;


/**
 * Home object for domain model class Territory.
 * 
 * @see Territory
 */
public class TerritoryDAO extends Default<Territory, String>
{
	public final static TerritoryDAO INSTANCE = new TerritoryDAO();
	
	public TerritoryDAO()
	{
		super(Territory.class);
	}
}
