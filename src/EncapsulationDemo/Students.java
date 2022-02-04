package EncapsulationDemo;

public class Students {

	/*
	 * Encapsulation: capsule:
	 * Getters: to get the data
	 * Setters: to set the data
	 * 
	 * types:
	 * neither can you see nor can you updat
	 * you can see but cannot update
	 * you can see and also update
	 * 
	 * problem: your data is exposed and can be accessed by anyone you dont have any
	 * control
	 * 
	 * it means hiding the data
	 */

	private int id; //R - no, W- no
	private int rollNo; //R - yes, W - no
	private String name; //r - yes, w - yes
	private String address; //r - yes, w - yes
	private long mobileNo;//r - yes, w - yes
	private String schoolName; //r - yes, w - no

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		//verify the address
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getSchoolName() {
		return schoolName;
	}


	
	
	
	
}
