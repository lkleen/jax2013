package org.larsworks.jaxrs20;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.InvocationCallback;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 23.04.13
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 */
public class AsyncRequest {

    private class SomeCallBack implements InvocationCallback<String>  {

        @Override
        public void completed(String s) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void failed(Throwable throwable) {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    public void run() {
        Client client = ClientBuilder.newClient();
        client.target("url")
                .request()
                .async()
                .get(new SomeCallBack());
    }

}
