package com.cheapflights.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cheapflights.qa.base.TestBase;
import com.cheapflights.qa.pages.FlightsPage;

public class FlightsPageTest extends TestBase {
	FlightsPage flights;

	public FlightsPageTest() {
		super();
	
	}
	@BeforeTest
	
	public void flights() {
		initialization();
		flights= new FlightsPage();
		
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		String title= flights.validateHomePageTitle();
		Assert.assertEquals(title, "Cheap Flights, Airline Tickets & Airfares - Find Deals on Flights at Cheapflights.com");
	}
	
	@Test(priority=2)
	
	public void cheapFlightsLogoTest() {
		boolean flag=flights.validateLogo();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	
	public void tripType() {
		flights.travelType();
	}
	
	@Test(priority=4)
	public void destinationPlace() throws InterruptedException {
		flights.enterDestinationPlace(prop.getProperty("destinationPlace"));
	}
	
	@Test(priority=5)
	public void selectDestination() {
		flights.selectDestination();
	}
	
	@Test(priority=6)
	public void tripDate() throws InterruptedException {
		flights.tripDate();
	}
	
	@Test(priority=7)
	public void travelersCount() throws InterruptedException {
		flights.travelersCount();
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		//driver.quit();
	}
	

	

}
