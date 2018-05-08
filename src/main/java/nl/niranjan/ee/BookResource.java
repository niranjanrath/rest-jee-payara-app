package nl.niranjan.ee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import java.util.HashMap;
import java.util.Map;

/**
 * REST Web Service
 *
 * @author mike
 */
@Path("book")
public class BookResource {

    @Context
    private UriInfo context;

    private Map<Integer, Book> library = new HashMap<>();

    /**
     * Get the value of library
     *
     * @return the value of library
     */
    public Map getLibrary() {
        return library;
    }

    /**
     * Set the value of library
     *
     * @param library new value of library
     */
    public void setLibrary(Map library) {
        this.library = library;
    }

    /**
     * Creates a new instance of BookResource
     */
    public BookResource() {
    }

    /**
     * Retrieves representation of an instance of fish.payara.examples.rest.BookResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{isbn}")
    @Produces("application/json")
    public JsonObject getJson(@PathParam("isbn") String isbn) {
        return Json.createObjectBuilder().add(isbn, library.get(isbn).getTitle()).build();
    }

    /**
     * PUT method for updating or creating an instance of BookResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}