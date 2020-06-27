package test;
import Bean.cbean;
import DAO.Implementation;
import DAO.Interface;
public class testcustomer
{
	public static void main(String[] args)
	{
		Interface di = new Implementation();
		cbean b = new cbean("Badhai Singhal", "Bebo01", "Infy@1043603",
				"badhaisinghal07@gmail.com",9414160599l, "1997-07-07",
				"Female", "13-A", "Agrasen Nagar", "Udiapole", "Udaipur",
				"Rajasthan","India" ,313001);
		if(di.SignUp(b))
		{
			System.out.println("Customer Added Successfully");
		}
		else
			System.out.println("Error");
		if(di.LogIn("Bebo01","Infy@1043603"))
		{
			System.out.println("LogIn Successfull");
		}
		else
			System.out.println("Kindly Sign Up");
	}
}