package demo.webservice.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import demo.bean.rest.json.adapter.JsonAdapter;

@Path("/rest")
@Produces(MediaType.APPLICATION_JSON) // 返回json数据
//@Produces(MediaType.APPLICATION_XML)
public interface JsonRest {
	
	@GET
    @Path("/json/{id}/")
	JsonAdapter getJson(@PathParam("id") String id);
	
}
