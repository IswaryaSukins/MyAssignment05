package week5.day2assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DeleteLeadAttribute extends BaseAttribute{
@Test(timeOut=40000,dependsOnMethods="week5.day2assignment.CreateleadsAttribute.runCreate",groups={"Smoke","Sanity"})
	public  void delete() throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9848960085");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		
		String leadID=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		
		if (text.equals("No records to display")) {
			
			System.out.println("Text matched");
		} else {
			
			System.out.println("Text not matched");
		}
		
		

}}
