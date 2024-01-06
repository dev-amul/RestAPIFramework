/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 29-Jun-2019
 *  FILE NAME  		: 	 BodyWithArray.java
 *  PROJECT NAME 	:	 ResAssuredProject
 *  Time			:	 11:34:31 pm
 */
package com.API_Testing.TestCasesScripts;
public class BodyWithArray 
{
	private int id ;
	private String first_Name; 
	private String last_Name;
	private String age ;
	private String designation;
	private AddressInformation[]  userAddress;
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
	public AddressInformation[] getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(AddressInformation[] userAddress) {
		this.userAddress = userAddress;
	}
	
	

}
