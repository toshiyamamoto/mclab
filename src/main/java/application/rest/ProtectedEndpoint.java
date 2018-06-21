package application.rest;

import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/protected")
public class ProtectedEndpoint {
  @GET
  @Produces({ MediaType.TEXT_HTML })
  public InputStream getContent() {
    try {
      return this.getClass().getResourceAsStream("/protected.html");
    } catch (Exception e) {
      throw new RuntimeException("Exception returning index.html", e);
    }
  }
}
