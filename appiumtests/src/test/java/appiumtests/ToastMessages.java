package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class  ToastMessages{
	
	public static AppiumDriver driver;
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName" , "vivo T1 5G");
		cap.setCapability("udid", "13807245170008V");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		
		cap.setCapability("appPackage", "io.selendroid.testapp");
		cap.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		cap.setCapability("automationName", "UiAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver(url, cap);
		
		System.out.println("Application Started....");
		
		WebElement ContinueButton = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		ContinueButton.click();
		
		Thread.sleep(3000);
		
		WebElement OkButton = driver.findElement(By.id("android:id/button1"));
		OkButton.click();
		
		Thread.sleep(3000);
		
		WebElement ToastButton = driver.findElement(By.id("io.selendroid.testapp:id/showToastButton"));
		ToastButton.click();
		
		WebElement ToastMessage = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Hello selendroid toast!\"]"));
		String ToastMsg = ToastMessage.getText();
		
		System.out.println(ToastMsg);
		

	}

}
