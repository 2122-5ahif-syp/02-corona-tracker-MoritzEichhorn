package com.fit.boundary;

import com.fit.controller.EntryRepository;
import com.fit.entities.Entry;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/entry")
@Transactional
public class EntryResource {
    @Inject
    EntryRepository entryRepository;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createEntry( @FormParam("firstName") String firstName,
                                 @FormParam("lastName") String lastName,
                                 @FormParam("email") String email,
                                 @FormParam("telephoneNo") String telephoneNo) {
        Entry e = new Entry(null, firstName, lastName, email, telephoneNo);
        entryRepository.persist(e);
        return Response.status(201).entity(e).build();
    }
}