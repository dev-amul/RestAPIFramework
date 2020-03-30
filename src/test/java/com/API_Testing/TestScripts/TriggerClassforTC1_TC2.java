/**
 * @author 			:	 Sumit chaudhary
 *	DATE       		:	 Mar 30, 2020
 *  FILE NAME  		: 	 TriggerClassforTC1_TC2.java
 *  PROJECT NAME 	:	 restassuredautomation_framwork
 * 
 */
package com.API_Testing.TestScripts;

import java.io.IOException;

public class TriggerClassforTC1_TC2 
{
	public static void main(String[] args) throws IOException {
		//create tc_02 reference variable 
		TC_02_GetPerticulerIddata trigerData = new TC_02_GetPerticulerIddata();
		
		trigerData.createData();//call tc1 method using tc2 reference variable
		trigerData.getIDData();//call tc2 method using tc2 reference variable 
	}

}
