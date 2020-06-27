package DTO;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class TransactionDTO
{
	private int TransactionId;
	private String UserName;
	private Date DateandTime;
	private int Amount_Paid;
	public int getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
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