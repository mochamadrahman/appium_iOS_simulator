package sampleproject;

import java.awt.Dimension;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Tests extends BaseClass {

	@Test(priority = 0) //BooksFind Application
	public void testOne() throws InterruptedException {

		driver.findElement(By.xpath(
				"//XCUIElementTypeApplication[@name=\"BooksFind\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"))
				.sendKeys("Wiki");
		Thread.sleep(2000);
		driver.findElement(By.id("icons8 search 24")).click();
		Thread.sleep(2000);

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);
		Thread.sleep(2000);
		
		Map<String, Object> args1 = new HashMap<String, Object>();
		args1.put("direction", "up");
		args1.put("name", "Rod Collins");
		driver.executeScript("mobile: scroll", args1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Wiki Management\"]")).click(); //XCUIElementTypeStaticText[@name="Rod Collins"])[2]  ////XCUIElementTypeStaticText[@name="Wiki Management"]
		Thread.sleep(2000);
//		
//		driver.findElementByAccessibilityId("Book List").click();
//		Thread.sleep(5000);
		
//		driver.switchTo().window("handle");
		
//		driver.switchTo().frame("Book List");

		MobileElement element = (MobileElement) driver.findElementByAccessibilityId("bg");
		element.click();
		Thread.sleep(1000);
		
		Map<String, Object> args2 = new HashMap<String, Object>();
		args2.put("element", ((MobileElement) element).getId());
		args2.put("x", 0);
		args2.put("y", 54);
		driver.executeScript("mobile: tap", args2);
		element.click();
		Thread.sleep(2000);
		
		MobileElement element1 = (MobileElement) driver.findElementByAccessibilityId("bg");
		element1.click();
		Thread.sleep(1000);
		
		Map<String, Object> args21 = new HashMap<String, Object>();
		args21.put("element", ((MobileElement) element1).getId());
		args21.put("x", 0);
		args21.put("y", 54);
		driver.executeScript("mobile: tap", args21);
		element1.click();
		Thread.sleep(2000);
		
//		MobileElement element11 = (MobileElement) driver.findElementByAccessibilityId("bg");
//		element11.click();
//		Thread.sleep(1000);
//		
//		Map<String, Object> args211 = new HashMap<String, Object>();
//		args211.put("element", ((MobileElement) element11).getId());
//		args211.put("x", 58);
//		args211.put("y", 464);
//		driver.executeScript("mobile: tap", args211);
//		element11.clear();
//		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"BooksFind\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")).clear();
		
		driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"BooksFind\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")).sendKeys("Automation");
		Thread.sleep(5000);
		driver.findElement(By.id("icons8 search 24")).click();
		Thread.sleep(2000);
		
		MobileElement element11 = (MobileElement) driver.findElementByAccessibilityId("bg");
		element11.click();
		Thread.sleep(1000);
		
		Map<String, Object> args211 = new HashMap<String, Object>();
		args211.put("element", ((MobileElement) element11).getId());
		args211.put("x", 0);
		args211.put("y", 54);
		driver.executeScript("mobile: tap", args211);
		element11.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"BooksFind\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")).clear();
	}
}
