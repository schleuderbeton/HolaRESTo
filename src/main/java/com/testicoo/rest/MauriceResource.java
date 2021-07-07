package com.testicoo.rest;

import org.eclipse.microprofile.jwt.JsonWebToken;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.security.Principal;
import java.time.LocalDateTime;

@Path("maurice")
public class MauriceResource {

    @Inject
    JsonWebToken token;
    @Inject
    Principal principal;


    @GET
    @RolesAllowed("maurice")
    public String ping() {
        return "MAURICE -> "+principal.getName() + " ["+token.getIssuer() +"] -- " + token.getGroups()+ ", " + LocalDateTime.now();
    }
}
