package week5.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseAttribute {
	public ChromeDriver driver;

	@BeforeMethod(alwaysRun=true)
	public void preCondition() {
	
	
    driver=new ChromeDriver();
	driver.get( "http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
}
	@AfterMethod(alwaysRun=true)
	public void postCondition() {
		driver.close();
	}
}
