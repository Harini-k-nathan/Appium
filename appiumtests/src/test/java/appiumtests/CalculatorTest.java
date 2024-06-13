package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorTest {

	public static AppiumDriver driver;
	
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
        DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName" , "vivo T1 5G");
		cap.setCapability("udid", "13807245170008V");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		
		cap.setCapability("appPackage", "com.vivo.calculator");
		cap.setCapability("appActivity", "com.vivo.calculator.Calculator");
		cap.setCapability("automationName", "UiAutomator2");
		
		
		// send this desired capabilities to appium server
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		 driver = new AppiumDriver(url, cap);
		
		System.out.println("Application Started....");
		
		
		WebElement one = driver.findElement(By.id("com.vivo.calculator:id/digit_1"));
		WebElement five = driver.findElement(By.id("com.vivo.calculator:id/digit_5"));
		WebElement plus = driver.findElement(By.id("com.vivo.calculator:id/op_add"));
		WebElement equals = driver.findElement(By.id("com.vivo.calculator:id/eq"));
		
		
		one.click();
		plus.click();
		five.click();
		equals.click();
		

		System.out.println("Completed");

	}
	
		
		

}
