package week5.day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadData extends BaseData{
	
	@DataProvider(name="setdata")
	public String[][] sendData() {
		String[][] data=new String[3][4];
		data[0][0]="TestLeaf";
		data[0][1]="Iswarya";
		data[0][2]="S";
		data[0][3]="678599";
		
		data[1][0]="TestLeaf";
		data[1][1]="Sukin";
		data[1][2]="S";
		data[1][3]="252353";
		
		data[2][0]="TestLeaf";
		data[2][1]="Ajay";
		data[2][2]="S";
		data[2][3]="963960";
		
		return data;
	}
	
	
	@Test(dataProvider="setdata")
	public  void runCreate(String cName,String fName,String lName,String phNumber) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNumber);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
	
}
