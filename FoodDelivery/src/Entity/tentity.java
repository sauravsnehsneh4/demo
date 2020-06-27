package Entity;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Transaction")
public class tentity
{
	@Id
	@GeneratedValue
	private int TransactionId;
	private String UserName;
	private Date DateandTime;
	private int Amount_Paid;
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