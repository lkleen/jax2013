package org.larsworks.jaxrs20;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 23.04.13
 * Time: 10:09
 * To change this template use File | Settings | File Templates.
 */
public class ChampionsLeagueClient {
    public static void main(String... args) {
        new ChampionsLeagueClient().run();
    }

    private void run() {
        Client client = ClientBuilder.newClient();
        client.register(EncryptionEntityInterceptor.class);
        WebTarget target = client.target("url");
        //Teams teams = new Tesmas

        //Response response target;

    }
}
