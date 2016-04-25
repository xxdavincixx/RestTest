package barPackage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/barha")
@Produces("text/json")
public class Bar {

	int id = 3;
	String bar = "CORNY";
	
	public Bar(int id, String bar){
		this.id = id;
		this.bar = bar;
	}
	
	public Bar(){
		
	}
	
	//@GET
	public String getBar(){
		return bar;
	}
	
	//@GET
	public int getId(){
		return id;
	}
	
	@GET
	public String sayPlainTextHello() {
	    return "Hello Jersey";
	}
	
	@Path("/ixemel")
	@GET
	@Produces("text/xml")
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}
	
	
	@Path("/indexu")
	@GET
	@Produces("text/html")
	public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	    + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	}
}
