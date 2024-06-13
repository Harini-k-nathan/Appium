package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class TestRegistration {
	
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
		
		WebElement RegistrationButton = driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration"));
		RegistrationButton.click();
		
		Thread.sleep(3000);
		
		WebElement UserName = driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
		UserName.sendKeys("Harini.kk");
		
		WebElement Email = driver.findElement(By.id("io.selendroid.testapp:id/inputEmail"));
		Email.sendKeys("hariniksv10@gmail.com");
		
		WebElement Password = driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
		Password.sendKeys("harini6148");
		
		WebElement Name = driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		Name.clear();
		Name.sendKeys("Harini");
		
		WebElement ProgrammingLanguage = driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage"));
		ProgrammingLanguage.click();
		
		
		WebElement JavaSelect = driver.findElement(By.xpath("//*[@text='Java']"));
		JavaSelect.click();
		
		driver.navigate().back();
		
		WebElement IacceptAdds = driver.findElement(By.id("io.selendroid.testapp:id/input_adds"));
		IacceptAdds.click();
		
		WebElement RegisterUser = driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser"));
		RegisterUser.click();
		
		

	}

}
