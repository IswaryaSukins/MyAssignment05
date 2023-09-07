package week5.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateleadsAttribute extends BaseAttribute{
@Test(invocationCount=1,priority=2,groups="Smoke")
public  void runCreate() throws InterruptedException {
		
	    driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Iswarya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sukin");
		
		WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select op=new Select(src);
		op.selectByValue("LEAD_EMPLOYEE");
		Thread.sleep(3000);
		
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select op1=new Select(campaign);
		op1.selectByValue("9001");
		Thread.sleep(3000);
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select op2=new Select(ownership);
		op2.selectByIndex(5);
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select op3=new Select(country);
		op3.selectByVisibleText("India");
		Thread.sleep(3000);
		
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
