package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url = "https://usdemo.vee24.com/#/transactions";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();

		//testCase1();
		testCase2();
		
		CommonUI.quitBrowser();
		
		
		
	}
	
	public static void testCase1() {
		
		transferPageObj.clickTopTransferButton();
		transferPageObj.clickOrginAccount();
		transferPageObj.moveToRainyDayAccount();
		transferPageObj.clickDestinationAccount();
		transferPageObj.moveToInvesting();
		transferPageObj.enterAmount("1000");
		transferPageObj.enterSSN("123435677");
		transferPageObj.enterAtmPin("1235");
		transferPageObj.clickTransferButton();
		
		String expectedMessage = "Success! Funds successfully transferred.";
		String actualMessage = transferPageObj.verifyTransferMessage();
		if(actualMessage.equals(expectedMessage)) {
			System.out.println("Transfer Message Verified");
		}else {
			System.out.println("Not Verified");
		}
	}
	


	public static void testCase2() {
		
		loanPageObj.clickLoanButton();
		loanPageObj.enterName("John Cena");
		loanPageObj.enterAddress("123 Java Drive");
		loanPageObj.clickLoan();
		loanPageObj.moveToRetirementAccount();
		loanPageObj.enterYearsToRepay("2");
		loanPageObj.clickNextButton();
		loanPageObj.enterAmount("5000");
		loanPageObj.enterMaidenName("Kim");
		loanPageObj.enterSSN("123456778");
		loanPageObj.clickNext2Button();
		loanPageObj.clickConfirmButton();
		
		String expectedMessage = "Submission Success";
		String actualMessage = loanPageObj.verifySubmissionMessage();
		
		if(actualMessage.equals(expectedMessage)) {
			System.out.println("Submission message verified");
		}else {
			System.out.println("Not Verified");
		}
		
		
		
		
	}
}




/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/