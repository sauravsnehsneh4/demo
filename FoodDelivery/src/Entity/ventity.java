package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vendor")
public class ventity
{
	@Id
	private String VendorName;
	private Long VendorContact;
	private String VendorEmail;
	private String VendorAddress;
	public String getVendorName()
	{
		return VendorName;
	}
	public void setVendorName(String vendorName)
	{
		VendorName = vendorName;
	}
	public Long getVendorContact() {
		return VendorContact;
	}
	public void setVendorContact(Long vendorContact){
		VendorContact = vendorContact;
	}
	public String getVendorAddress() {
		return VendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		VendorAddress = vendorAddress;
	}
	public String getVendorEmail() {
		return VendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		VendorEmail = vendorEmail;
	}
}