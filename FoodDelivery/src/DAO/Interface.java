package DAO;

import Bean.cbean;
import Bean.tbean;

public interface Interface
{
	public boolean LogIn(String UserName, String Password);
	public boolean SignUp(cbean b);
	public boolean getVendor(String ItemName);
	public boolean complete_transaction(tbean b);
	public boolean getItem(String VendorName);
}