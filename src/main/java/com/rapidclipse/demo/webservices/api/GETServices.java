
package com.rapidclipse.demo.webservices.api;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;
import com.rapidclipse.demo.webservices.api.transferables.CustomerTransferable;
import com.rapidclipse.demo.webservices.dal.CustomerDAO;
import com.rapidclipse.demo.webservices.domain.Customer;
import com.rapidclipse.framework.server.Rap;


@Path("/get")
public class GETServices
{

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") final String msg)
	{
		final String output = "Ohne Authentication: Hello " + msg;

		return Response.status(200).entity(output).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	@Path("/customer/{customerid}")
	public Response getCustomerByCustomerID(@PathParam("customerid") final String customerID)
		throws InterruptedException, ExecutionException
	{

		final Future<CustomerTransferable> customerCall = Rap.getExecutorService().submit(() -> {
			final Customer             customer = new CustomerDAO().find(customerID);
			final CustomerTransferable t        = customer.createTransferable();

			return t;
		});

		final Gson g = new Gson();

		try
		{
			return Response.status(200).entity(g.toJson(customerCall.get())).build();
		}
		catch(final Exception e)
		{
			throw new WebApplicationException(e, Status.INTERNAL_SERVER_ERROR);
		}
	}

	@GET
	@Path("/secure")
	public String sayHello(@QueryParam("name") final String name)
	{
		return "Gesichert mit Authentication: Hello " + name;
	}
}
