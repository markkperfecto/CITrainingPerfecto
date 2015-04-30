package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class enterZipCode {
WebDriver driver; // Local Variable declaration
	
	public void enterZipCode(){
		this.driver = driver; // Constructor, which means this "driver" is going to be inherited (visible and usable anywhere under this Class) 
	}
	
	public void EnterZipCode(WebDriver driver){
		System.out.println("### Entering zipcode ###");
		driver.findElement(By.xpath("//input[@name='txtZip']")).sendKeys("02116");

		driver.findElement(By.xpath("//div[@name='cmdSubmit']")).click();
		sleep(5000);
		takeScreenshot();
		sleep(2000);
	}
	
	private static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}
	
	public byte[] takeScreenshot() {
        System.out.println("Taking screenshot");
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
