package com.testicoo.rest;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.jwt.JsonWebToken;


/**
 *
 * @author testicoo.com
 */
@Path("ping")
public class PingResource {

    @Inject
    JsonWebToken token;

    @Inject
    Principal principal;

    @GET
    @RolesAllowed("capo")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> ping() {
        Map<String, String> pingResponse = new HashMap<>();
        pingResponse.put("Method", "PingResource.ping()");
        pingResponse.put("Timestamp", LocalDateTime.now().toString());
        pingResponse.put("Principal", principal.getName());
        pingResponse.put("JWT-Issuer", token.getIssuer());
        pingResponse.put("JWT-Name", token.getName());
        pingResponse.put("JWT-TokenID", token.getTokenID());
        pingResponse.put("JWT-Subject", token.getSubject());
        pingResponse.put("JWT-Groups", token.getGroups().toString());
        return pingResponse;
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Map<String, String> ping2() {
//        Map<String, String> pingResponse = new HashMap<>();
//        pingResponse.put("Method", "PingUnsecureResource.ping()");
//        pingResponse.put("Timestamp", LocalDateTime.now().toString());
//        pingResponse.put("Service", "Unsecure Rest Available!");
//        return pingResponse;
//    }

}
