package Bean;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
public class tbean
{
	@Id
	@GeneratedValue
	private int TransactionId;
	private String UserName;
	private Date DateandTime;
	private int Amount_Paid;
	public tbean(String UserName, Timestamp DateandTime, int Amount_Paid)
	{
		this.UserName=UserName;
		this.DateandTime=DateandTime;
		this.Amount_Paid=Amount_Paid;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Date getDateandTime() {
		return DateandTime;
	}
	public void setDateandTime(Date dateandTime) {
		DateandTime = dateandTime;
	}
	public int getAmount_Paid() {
		return Amount_Paid;
	}
	public void setAmount_Paid(int amount_Paid) {
		Amount_Paid = amount_Paid;
	}
}