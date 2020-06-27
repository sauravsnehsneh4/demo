package DAO;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import Bean.cbean;
import Bean.tbean;
import Entity.entity;
import Entity.ientity;
import Entity.tentity;
import resources.hibernateutility;
public class Implementation implements Interface
{
	public boolean LogIn(String UserName, String Password)
	{
		SessionFactory sf = hibernateutility.createSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		String checkUser="from entity c where c.UserName=?0 and c.Password=?1";
		System.out.println("The query created is: "+checkUser);
		Query q = s.createQuery(checkUser,entity.class);
		q.setParameter(0, UserName);
		q.setParameter(1, Password);
		List<entity> result=(List<entity>)q.list();
		if(result.size()>0)
		{
			System.out.println("User Found");
			s.close();
			return true;
		}
		else
		{
			System.out.println("User Not Found");
		}
		s.getTransaction().commit();
		s.close();
		return false;
	}
	public boolean SignUp(cbean b)
	{
		SessionFactory sf = hibernateutility.createSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		entity ce = new entity();
		ce.setArea(b.getArea());
		ce.setCity(b.getCity());
		ce.setDateOfBirth(b.getDateOfBirth());
		ce.setEmail(b.getEmail());
		ce.setFlatNumber(b.getFlatNumber());
		ce.setGender(b.getGender());
		ce.setLocality(b.getLocality());
		ce.setMobileNumber(b.getMobileNumber());
		ce.setName(b.getName());
		ce.setPassword(b.getPassword());
		ce.setPIN(b.getPIN());
		ce.setState(b.getState());
		ce.setUserName(b.getUserName());
		String UName=(String) s.save(ce);
		System.out.println("The primary key returned is: "+UName);
		s.getTransaction().commit();
		s.close();
		return true;
	}
	public boolean complete_transaction(tbean b)
	{
		SessionFactory sf = hibernateutility.createSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		tentity te=new tentity();
		te.setUserName(b.getUserName());
		te.setDateandTime(b.getDateandTime());
		te.setAmount_Paid(b.getAmount_Paid());
		int TId = (Integer) s.save(te);
		System.out.println("Transaction id returned is: "+TId);
		s.getTransaction().commit();
		s.close();
		return true;
	}
	public boolean getItem(String VendorName)
	{
		SessionFactory sf = hibernateutility.createSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		String createquery = "from ientity i where i.VendorName = ?0";
		System.out.println("Created query is "+createquery);
		Query q = s.createQuery(createquery);
		q.setParameter(0, VendorName);
		List<ientity> result= q.list();
		if(result.size()>0)
		{
			for(ientity i1:result)
				System.out.println(i1.getItemName());
			s.close();
			return true;
		}
		else
		{
			System.out.println("No items available");
		}
		s.close();
		s.getTransaction().commit();
		return false;
	}
	public boolean getVendor(String ItemName)
	{
		SessionFactory sf = hibernateutility.createSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		String checkVendor="select i from ientity i where i.ItemName=?0";
		System.out.println("The query created is: "+checkVendor);
		Query q = s.createQuery(checkVendor);
		q.setParameter(0, ItemName);
		List<ientity> result=(List<ientity>)q.list();
		if(result.size()>0)
		{
			for ( ientity ie:result)
			{
				System.out.println(ie.getVendorName());
			}
			s.getTransaction().commit();
			s.close();
			return true;
		}
		else
		{
			System.out.println("No Vendors Available");
		}
		s.close();
		s.getTransaction().commit();
		return false;
	}
}