package com.galenframework.java.sample.tests;

import com.galenframework.api.Galen;
import com.galenframework.java.sample.components.GalenTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;


public class WelcomePageTest extends GalenTestBase {

    /*@Test(dataProvider = "devices")
    public void welcomePage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
       checkLayout("/specs/welcomePage.spec", device.getTags());
    }

    @Test(dataProvider = "devices")
    public void loginPage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        getDriver().findElement(By.xpath("//button[.='Login']")).click();
        checkLayout("/specs/loginPage.spec", device.getTags());
    }*/
	
	
	  @Test(dataProvider = "devices")
	    public void usbHomePage_creativeTest_onDeskTop(TestDevice device) throws IOException {
	        load("/");
	      //  getDriver().findElement(By.xpath(".//button[contains(@class,'navbar-toggle')]")).click();
	        checkLayout("/specs/common.spec", device.getTags());


	    }

}
