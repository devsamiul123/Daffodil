
public class Person {
	private String name;
	private String phnNum;
	private String gender;
	private int age;
	private String address;
	private String passportNo;
	
	public Person(String name, String phnNum, String gender, int age, String address, String passportNo) {
		super();
		this.name = name;
		this.phnNum = phnNum;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.passportNo = passportNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnNum() {
		return phnNum;
	}
	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
	
}
