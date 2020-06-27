package test;
import DAO.Implementation;
import DAO.Interface;
public class testitem
{
	public static void main(String[] args)
	{
		Interface di = new Implementation();
		if(di.getVendor("Margerita"))
		{
			System.out.println("Item found");
		}
		else
			System.out.println("Error");
	}
}