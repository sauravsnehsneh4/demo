package resources;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class hibernateutility
{
	public static final String CONFIGURATION_LOCATION = "resources/hibernate.cfg.xml";
	private static SessionFactory sessionfactory = getSessionFactory();
	private static SessionFactory getSessionFactory()
	{
		try
		{
			if(sessionfactory==null)
			{
				//Step:1 Loading the configuration details from hibernate.cfg.xml
				Configuration configuration=new Configuration().configure(CONFIGURATION_LOCATION);
				//Step:2 Creating ServiceRegistry using the StandardServiceRegistryBuilder and Configuration defined in step1
				//ServiceRegistry serviceregistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				//Step:3 Creating the SessionFactory using the configuration and serviceregistry
				sessionfactory=configuration.buildSessionFactory();
				//serviceregistry in above brackets
			}
		}
		catch(Exception e)
		{
			System.err.println("ERROR : HibernateUtility: "+e.getMessage());
			//throw e;
			e.printStackTrace();
		}
		return sessionfactory;
	}
	public static SessionFactory createSessionFactory()
	{
		return getSessionFactory();
	}
	public static void closeSessionFactory()
	{
		if(!sessionfactory.isClosed() || sessionfactory!=null)
		{
			sessionfactory.close();
		}
	}
}