package iosdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class FirstiOSTest {

	public static void main(String[] args) throws MalformedURLException {
		
		firstTest();
	}
	
	public static void firstTest() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "IOS");
		caps.setCapability("platformVersion", "10.2.1");
		caps.setCapability("deviceName", "iPhone 5");
//		caps.setCapability("äpp", ""location of .app or .ipa file);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		IOSDriver driver = new IOSDriver<IOSElement>(url, caps);
		
	}
	
	

}
