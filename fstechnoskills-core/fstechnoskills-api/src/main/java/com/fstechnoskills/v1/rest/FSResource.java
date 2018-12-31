/**
 * 
 */
package com.fstechnoskills.v1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author dvishwak
 *
 */
@Path("/app")
@Produces(MediaType.APPLICATION_JSON)
public class FSResource {
	
	public static final String VERSION = "1.0";
	public static final String APP_NAME = "Fullstack Technoskills Application";
	
	@GET
	@Path("/name")	
	public Response getApplicationName() {		
		return Response.ok( APP_NAME ).build();		
	}
	
	@GET
	@Path("/version")
	public Response getVersion() {
		return Response.ok( APP_NAME + " version: " + VERSION ).build();
	}

}
