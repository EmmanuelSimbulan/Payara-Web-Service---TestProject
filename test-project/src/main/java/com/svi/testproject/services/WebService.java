package com.svi.testproject.services;

import javax.json.Json;
import javax.json.JsonObject;
import javax.net.ssl.SSLEngineResult.Status;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import com.svi.testproject.enums.Config;
import com.svi.testproject.object.Person;

@Path("test-class")
public class WebService {

	@GET
	@Path("health-check")
	public Response healthCheck() {

		return Response.ok("goods").build();
		
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("test")
	public Response test(Person person) {
		String name = person.getName();
		int age = person.getAge();
		JsonObject response = Json.createObjectBuilder()
				.add("name", name)
				.add("age", age)
				.build();
		
		
		return Response.ok(response.toString()).build();
		
	}
	
	@GET
	@Path("get-config")
	public Response getConfig() {
		
		String sample = Config.SAMPLE_CONFIG.value();
		
		return Response.ok(sample).build();
		
	}
}
