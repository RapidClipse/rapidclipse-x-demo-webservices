
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;
import com.rapidclipse.demo.webservices.domain.Region;


/**
 * Home object for domain model class Region.
 * 
 * @see Region
 */
public class RegionDAO extends Default<Region, Integer>
{
	public final static RegionDAO INSTANCE = new RegionDAO();
	
	public RegionDAO()
	{
		super(Region.class);
	}
}
