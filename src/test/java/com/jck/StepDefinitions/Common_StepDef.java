package com.jck.StepDefinitions;

import com.jck.ReusableComponents.Helper;


import io.cucumber.java.Before;

public class Common_StepDef extends Helper{

	@Before
	public void beforeScenario()
	{
		
		launchBrowser();
			}
}
