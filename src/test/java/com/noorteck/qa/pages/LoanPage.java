package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoanPage extends CommonUI {
	
	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[4]/a/span")
	WebElement loansButton;
	
	@FindBy(xpath = "//*[@placeholder='First name, Last name']")
	WebElement nameField;
	
	@FindBy(xpath = "//*[@placeholder='Street, City, Zip Code']")
	WebElement addressField;
	
	@FindBy(xpath = "//*[@id=\"mat-select-0\"]/div/div[1]/span")
	WebElement loanType;
	
	@FindBy(xpath = "//*[@id=\"mat-option-3\"]/span")
	WebElement retirementLoanType;
	
	@FindBy(xpath = "//*[@placeholder='Ex. 1 Year']")
	WebElement yearsToRepayField;
	
	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/form/div/button/span")
	WebElement nextButton;
	
	@FindBy(xpath = "//*[@placeholder='Ex. 10000']")
	WebElement amountField;
	
	@FindBy(xpath = "//*[@placeholder='Ex. Smith']")
	WebElement motherMaidenNameField;
	
	@FindBy(xpath = "//*[@placeholder='Format: XXX-XX-XXXX']")
	WebElement ssnField;
	
	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/form/div/button[2]/span")
	WebElement secondNextButton;
	
	@FindBy(css = ".v24DomSyncDenyAgent.mat-raised-button.mat-primary")
	WebElement confirmButton;
	
	@FindBy(xpath = "/app-loan-success/div/div/div/div/mat-card/mat-card-title")
	WebElement submissionSuccessMessage;
	
	public LoanPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoanButton() {
		click(loansButton);
	}
	
	public void enterName(String name) {
		enter(nameField, name);
	}
	
	public void enterAddress(String address) {
		enter(addressField, address);
	}
	
	public void clickLoan() {
		click(loanType);
		
	}
	
	public void moveToRetirementAccount() {
		moveToElementAndClick(retirementLoanType);
	}

	public void enterYearsToRepay(String years) {
		enter(yearsToRepayField, years);
	}
	
	public void clickNextButton() {
		click(nextButton);
	}
	
	public void enterAmount(String amount) {
		enter(amountField, amount);
	}
	
	public void enterMaidenName(String maidenName) {
		enter(motherMaidenNameField, maidenName);
	}
	public void enterSSN(String ssn) {
		enter(ssnField, ssn);
	}
	public void clickNext2Button() {
		click(secondNextButton);
	}
	public void clickConfirmButton() {
		click(confirmButton);
	}
	public String verifySubmissionMessage() {
		return getText(submissionSuccessMessage);
	}
	

}
