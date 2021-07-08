package com.testicoo.rest;

import org.eclipse.microprofile.jwt.JsonWebToken;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.security.Principal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Path("maurice")
public class MauriceResource {

    @Inject
    JsonWebToken token;
    @Inject
    Principal principal;


//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Map<String, String> ping2() {
//        Map<String, String> pingResponse = new HashMap<>();
//        pingResponse.put("Method", "Maurice.ping2()");
//        pingResponse.put("Timestamp", LocalDateTime.now().toString());
//        pingResponse.put("Service", "Unsecure Rest Available!");
//        return pingResponse;
//    }


    @GET
    @RolesAllowed("maurice")
    public String ping() {
//        return "MAURICE -> "+principal.getName() + " ["+token.getIssuer() +"] -- " + token.getGroups()+ ", " + LocalDateTime.now();
        return "MAURICE -> chello chello"+ ", " + LocalDateTime.now();
    }
}
