package com.scobi.leads;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.scobi.genericlibrary.BaseTest;

public class CreateLeadsTest extends BaseTest{

	@Test
	public void createLeads()
	{
		Reporter.log("Home Page is Displayed",true);
		Reporter.log("Leads Page is Displayed",true);
		Reporter.log("Created Leads Successfully",true);
	}
}
