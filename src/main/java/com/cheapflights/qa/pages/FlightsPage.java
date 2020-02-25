package com.cheapflights.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cheapflights.qa.base.TestBase;

public class FlightsPage extends TestBase {
	
	@FindBy(xpath="//label[@class='r9-radiobuttonset-label']")
	WebElement tripType;
	
	@FindBy(xpath="//*[@name='destination']")
	WebElement destination;
	
	@FindBy(xpath="//*[@id='ap-MIA/14305']")
	WebElement destinationCode;
	
	@FindBy(xpath="//span[@class='plane']")
	WebElement cheapFlightsLogo;

	@FindBy(xpath="//*[@aria-label='November 29']")
	WebElement tripDate;
	
	@FindBy(xpath="//*[@aria-label='Select number of travelers and cabin class']")
	WebElement travelersCount;
	
	@FindBy(xpath="//*[@class=\"Common-Widgets-Button-ButtonDeprecated Common-Widgets-Button-Button Button-Gray-Shadow size-m incrementor-js\"]")
	WebElement noOfTraveleres;
	
	@FindBy(xpath="//div[@class=\"cabinTravelerWrapper\"]//div[@class=\"close\"]")
	WebElement close;
	
	@FindBy(xpath="//div[@class=\"fieldBlock buttonBlock\"]//button[@type=\"submit\"]")
	WebElement findDeals;
	
	
	
	//Initializing page objects
	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	
	public boolean validateLogo(){
		return  cheapFlightsLogo.isDisplayed();
	}
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public String enterDestinationPlace(String dest) throws InterruptedException {
		destination.click();
		Thread.sleep(3000);
		destination.sendKeys(dest);
		return dest;
	}
	
	public void selectDestination() {
		destinationCode.click();
	}
	
	public void travelType() {
		tripType.click();
	}
	
	public void tripDate() throws InterruptedException {
		//Thread.sleep(3000);
		tripDate.click();
		Thread.sleep(7000);
	}
	
	public void travelersCount() throws InterruptedException {
		//Thread.sleep(7000);
		//travelersCount.click();
		//noOfTraveleres.click();
		//close.click();
		findDeals.click();
	}
	
	int array[]= {1,2,3,4};
	

}
