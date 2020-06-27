package Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Item")
public class ientity
{
	@Id
	@GeneratedValue
	private int ItemId;
	private String ItemName;
	private String ItemDescription;
	private String VendorName;
	private String Veg;
	private String Cuisine;
	private int Price;
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getItemDescription() {
		return ItemDescription;
	}
	public void setItemDescription(String itemDescription) {
		ItemDescription = itemDescription;
	}
	public String getVeg() {
		return Veg;
	}
	public void setVeg(String veg) {
		Veg = veg;
	}
	public String getCuisine() {
		return Cuisine;
	}
	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getVendorName() {
		return VendorName;
	}
	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}
}