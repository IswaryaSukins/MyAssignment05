package week5.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteIncidents extends ProjectSpecificMethod {
	 @Test(dependsOnMethods = "week5.day1assignment.CreateIncidents.runCreateIncidents")
	    public void runDeleteIncidents() {
	        WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	        driver.switchTo().frame(frame);
	        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(incidentNo, Keys.ENTER);
	    }
	    
	}

