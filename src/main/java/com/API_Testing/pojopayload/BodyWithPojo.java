/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 28-Jun-2019
 *  FILE NAME  		: 	 Body.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 9:44:10 pm
 *  Assignment		:	 22 June 2019
 */
package com.API_Testing.pojopayload;

public class BodyWithPojo 
{
	private int id ;
	private String first_Name; 
	private String last_Name;
	private String age ;
	private String designation;
	private AddressInformation  userAddress;
	// POJO concept 
	// As per pojo concept create a getter and setter 
	
	public AddressInformation getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(AddressInformation userAddress) {
		this.userAddress = userAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
