package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {
	
	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[2]/a/span")
	WebElement topTransferButton;
	
	@FindBy(xpath = "//*[@id=\"mat-select-0\"]/div/div[1]/span")
	WebElement orginAccount;

	@FindBy(xpath = "//*[@id=\"mat-option-5\"]/span")
	WebElement rainyDayAccountDropDown;
	
	@FindBy(xpath = "//*[@id=\"mat-select-1\"]/div/div[1]/span")
	WebElement destinationAccount;
	
	@FindBy(xpath = "//*[@id=\"mat-option-7\"]/span")
	WebElement investingAccountDropDown;
	
	@FindBy(xpath = "//*[@placeholder='Ex. 10000']")
	WebElement amountField;
	
	@FindBy(xpath = "//*[@placeholder='Social Security Number']")
	WebElement ssnField;
	
	@FindBy(xpath = "//*[@placeholder='ATM PIN']")
	WebElement atmPinField;
	
	@FindBy(xpath = "//span[text()='Transfer Funds']")
	WebElement transferFundsButton;
	
	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/main/app-success/div/div/div/div/mat-card/mat-card-title")
	WebElement transferCompleteMessage;
	

	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickTopTransferButton() {
		click(topTransferButton);
	}
	
	public void clickOrginAccount() {
		click(orginAccount);
	}
	
	public void moveToRainyDayAccount() {
		moveToElementAndClick(rainyDayAccountDropDown);
	}
	
	public void clickDestinationAccount() {
		click(destinationAccount);
	}
	
	public void moveToInvesting() {
		moveToElementAndClick(investingAccountDropDown);
	}
	
	public void enterAmount(String amount) {
		enter(amountField, amount);
	}
	
	public void enterSSN(String ssn) {
		enter(ssnField, ssn);
	}
	
	public void enterAtmPin(String pin) {
		enter(atmPinField, pin);
	}
	
	public void clickTransferButton() {
		click(transferFundsButton);
	}
	
	public String verifyTransferMessage() {
		return getText(transferCompleteMessage);
	}
	
	
	
}
