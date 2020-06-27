package Bean;

import javax.persistence.Id;

public class cbean
{
	@Id
	private String UserName;
	private String Name;
	private String Password;
	private String Email;
	private Long MobileNumber;
	private String DateOfBirth;
	private String Gender;
	private String FlatNumber;
	private String Area;
	private String Locality;
	private String City;
	private String State;
	private String Country;
	private int PIN;

	public cbean(String Name, String UserName, String Password, String Email, Long MobileNumber, String DateOfBirth,
			String Gender, String FlatNumber, String Area, String Locality, String City, String State, String Country,
			int PIN)
	{
		this.Name=Name;
		this.UserName=UserName;
		this.Password=Password;
		this.Email=Email;
		this.setMobileNumber(MobileNumber);
		this.DateOfBirth=DateOfBirth;
		this.Gender=Gender;
		this.FlatNumber=FlatNumber;
		this.Area=Area;
		this.Locality=Locality;
		this.City=City;
		this.State=State;
		this.Country=Country;
		this.setPIN(PIN);
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getFlatNumber() {
		return FlatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		FlatNumber = flatNumber;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getLocality() {
		return Locality;
	}
	public void setLocality(String locality) {
		Locality = locality;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public Long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
}