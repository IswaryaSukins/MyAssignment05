package week5.day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public Shadow shadow;
	public static String incidentNo;
	    @BeforeMethod
	    public void preCondition() throws InterruptedException {
	        ChromeOptions option = new ChromeOptions();
	        option.addArguments("--disable-notifications");
	        driver = new ChromeDriver(option);
	        driver.get("https://dev120081.service-now.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        shadow = new Shadow(driver);
	        
	        shadow.setImplicitWait(5); //acts like Thread.sleep
	        driver.findElement(By.id("user_name")).sendKeys("admin");
	        driver.findElement(By.id("user_password")).sendKeys("$AWWF0/a2afr");
	        driver.findElement(By.id("sysverb_login")).click();
	        Thread.sleep(10000);
	        shadow.findElementByXPath("//div[contains(@class,'sn-polaris-tab')]").click();
	        shadow.setImplicitWait(5);
	        shadow.findElementByXPath("//input[@id='filter']").sendKeys("Incidents",Keys.ENTER);
	    
	        
	    }
	    
	    @AfterMethod
	    public void postCondition() {
	        driver.close();
	    }
}
