package barPackage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/bar")
public class BarController {
	Bar[] bars = { new Bar(1, "Bareins"),new Bar(2, "Bareins"),new Bar(3, "Bareins")};
	
		
	
		
	public BarController(){
		
		
		
	}
	
	@GET
	@Produces("text/xml")
	public int getBars(){
		return bars[1].id;
	}
	
	
	//@GET
	
	public int getInt(){
		return 3;
	}
}
