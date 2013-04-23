package org.larsworks.jaxrs20;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 23.04.13
 * Time: 10:36
 * To change this template use File | Settings | File Templates.
 */
@Priority(Priorities.AUTHORIZATION)
public class ClientBasicAuthFilter implements ClientRequestFilter {

    private String authHeader;

    public ClientBasicAuthFilter() {
    }

    @Override
    public void filter(ClientRequestContext ctx) throws IOException {
        //ctx.abortWith(null); // abort request processing with response
        ctx.getHeaders().add(HttpHeaders.AUTHORIZATION, authHeader);
    }
}
