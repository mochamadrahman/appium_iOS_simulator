package sampleproject;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

//	AppiumDriver<MobileElement> driver;
	IOSDriver<IOSElement> driver;

	@BeforeTest
	public void setup() {

		try {

			DesiredCapabilities caps = new DesiredCapabilities();

			// Simulator
			caps.setCapability("platformName", "iOS");
			caps.setCapability("platformVersion", "13.3");
			caps.setCapability("deviceName", "iPhone 11 Pro Max");
			caps.setCapability("app", "/Users/rahman/Desktop/BooksFind.app");
			caps.setCapability("noReset", true);

			// caps.setCapability(CapabilityType.BROWSER_NAME, "Safari");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");

//			driver = new AppiumDriver<MobileElement>(url, caps);
			driver = new IOSDriver<IOSElement>(url, caps);

		} catch (Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}

	}

//	@Test
//	public void sampleTest() {
//		System.out.println("Ï am inside sample Test");
//	}

	@AfterTest
	public void teardown() {
//		driver.close();
		driver.quit();
	}

}