package api;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationPath("/api")
public class APPConfig extends Application
{
	private HashSet<Class<?>> resources;
	public APPConfig()
	{
		resources = new HashSet();
		resources.add(CustomerResource.class);
		resources.add(ItemResource.class);
		resources.add(VendorResource.class);
		resources.add(TransactionResource.class);
	}
	@Override
	public Set<Class<?>> getClasses()
	{
		return resources;
	}
}