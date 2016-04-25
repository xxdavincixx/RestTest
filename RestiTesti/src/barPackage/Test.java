package barPackage;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class Test {

  public static void main(String[] args) {
    ClientConfig config = new ClientConfig();

    Client client = ClientBuilder.newClient(config);

    WebTarget target = client.target(getBaseURI());

    String response = target.path("bar").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();


    String plainAnswer = 
        target.path("bar").request().accept(MediaType.TEXT_PLAIN).get(String.class);
    
    System.out.println(response);
    System.out.println(plainAnswer);
    
  }

  private static URI getBaseURI() {
    return UriBuilder.fromUri("http://localhost:8181/RestiTesti").build();
  }
} 