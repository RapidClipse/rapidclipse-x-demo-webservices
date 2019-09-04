
package com.rapidclipse.demo.webservices.dal;

import com.rapidclipse.demo.webservices.domain.Employee;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject.Default;


/**
 * Home object for domain model class Employee.
 * 
 * @see Employee
 */
public class EmployeeDAO extends Default<Employee, Integer>
{
	public final static EmployeeDAO INSTANCE = new EmployeeDAO();
	
	public EmployeeDAO()
	{
		super(Employee.class);
	}
}
