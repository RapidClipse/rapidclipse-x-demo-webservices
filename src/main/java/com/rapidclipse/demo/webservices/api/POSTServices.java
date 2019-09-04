
package com.rapidclipse.demo.webservices.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/post")
public class POSTServices
{
	
	@POST
	@Path("insert")
	@Consumes("application/json;charset=utf-8")
	public Response insertCustomer(final String transferable)
	{
		
		try
		{
			
			// 1. Umwandeln des Strings per GSON wieder in eine Transferable
			// 2. Mappen des Transferabeles wieder auf eine verwendbares Entity
			// 3. Speichern des Entitys
			// 4. Rückgabe des Status siehe unten
			
			return Response.status(201).build();
		}
		catch(final Exception e)
		{
			return Response.status(404).build();
		}
	}
}
