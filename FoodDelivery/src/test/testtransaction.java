package test;
import java.sql.Timestamp;
import java.util.Date;
import Bean.tbean;
import DAO.Implementation;
import DAO.Interface;
public class testtransaction
{
	public static void main(String[] args)
	{
		Interface ti = new Implementation();
		Date dt = new Date();
		Timestamp ts = new Timestamp(dt.getTime());
		tbean b = new tbean("Bebo",ts,50);
		if(ti.complete_transaction(b))
			System.out.println("Transaction done.");
		else
			System.out.println("Error");
	}
}