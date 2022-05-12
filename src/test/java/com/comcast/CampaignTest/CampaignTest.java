package com.comcast.CampaignTest;

import org.testng.annotations.Test;
//kempi   
public class CampaignTest {

	@Test(groups = "smokeTest")
	public void CreateCampaignTest() {
		System.out.println("===Campaign Created=====");
		String value1 = System.getProperty("BROWSER");
		System.out.println(value1);
	}

	//hihi
	//HI DHANU AND ARCHANA
	@Test(groups = "regressionTest")
	public void ModifyCampaignTest() {
		System.out.println("===Campaign Modified sucessfully=====");
	}
	
	@Test(groups = "regressionTest")
	public void DeleteCampaignTest() {
		System.out.println("===Campaign Deleted=====");
	}
}
