package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenURL {
	WebDriver driver; // Local Variable declaration
	
	public void OpenURL(){
		this.driver = driver; // Constructor, which means this "driver" is going to be inherited (visible and usable anywhere under this Class) 
	}
	
	public void OpenHomePage(WebDriver driver){
		System.out.println("### Opening homepage ###");
		driver.get("http://homedelivery.bostonglobe.com/"); // THE TEST ITSELF! (Actual action)
		sleep(5000);
	}
	
	private static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}
}
