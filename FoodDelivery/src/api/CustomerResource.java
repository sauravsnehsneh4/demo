package api;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import DTO.CustomerDTO;
@Path("/customer")
public class CustomerResource
{
	@POST
	@Path("/signup")
	@Consumes("application/json,text/plain,application/x-www-form-urlencoded")
	@Produces("application/json,application/x-www-form-urlencoded,text/plain")
	public Response SignUp(CustomerDTO cd)
	{
		return null;
	}
}