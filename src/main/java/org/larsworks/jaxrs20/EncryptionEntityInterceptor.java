package org.larsworks.jaxrs20;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 23.04.13
 * Time: 10:45
  */
public class EncryptionEntityInterceptor implements WriterInterceptor {

    @Override
    public void aroundWriteTo(WriterInterceptorContext ctx) throws IOException, WebApplicationException {
        OutputStream os = ctx.getOutputStream();


        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ctx.setOutputStream(buffer);
        ctx.proceed();

        buffer.flush();

        byte[] content = buffer.toByteArray();
        String original  = new String(content);
        String encrypted = new String(content);

        // modify content

        os.write(encrypted.getBytes());
    }
}
