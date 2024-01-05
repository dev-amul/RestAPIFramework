/**
 * @author 			:	 Sumit Kumar Chaudhary
 *	DATE       		:	 06-Jan-2022
 *  FILE NAME  		: 	 GetAbsolutePathByFileNameController.java
 *  PROJECT NAME 	:	 RestAPIFramework
 * 
 */
package com.API_Testing.utitlites;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;

public class GetAbsolutePathByFileNameController {
	public static String getAbsolutPath(String fileName) {
    
		String fileAbolutePath ="";
        try {
            boolean recursive = true;
            //Collection method
            Collection files = FileUtils.listFiles(new File(System.getProperty("user.dir")), null, recursive);
            for (Iterator iterator = files.iterator(); iterator.hasNext();) {
                File file = (File) iterator.next();
                if (file.getName().equals(fileName))
                	fileAbolutePath=file.getAbsolutePath();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileAbolutePath;
    }


}
