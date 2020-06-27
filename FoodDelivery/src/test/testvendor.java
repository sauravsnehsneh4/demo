package test;
import DAO.Implementation;
import DAO.Interface;
public class testvendor
{
	public static void main(String[] args)
	{
		Interface dv = new Implementation();
		if(dv.getItem("PizzaHut"))
		{
			System.out.println("Items found");
		}
		else
			System.out.println("Error");
	}
}