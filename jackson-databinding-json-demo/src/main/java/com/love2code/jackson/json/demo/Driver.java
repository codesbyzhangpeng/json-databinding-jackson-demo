package com.love2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			// read JSON file and map/convert to Java POJO
			// data/ sample-lite.json
			
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print the first name and last name;
			
			Address theAddress = theStudent.getAddress();
			
			System.out.println(theStudent.getFirstName() + "  " + theStudent.getLastName());
			
			for(String tempLang:theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
