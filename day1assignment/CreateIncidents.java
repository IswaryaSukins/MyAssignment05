package week5.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateIncidents extends ProjectSpecificMethod{
	 @Test
	    public void runCreateIncidents() throws InterruptedException {
	        WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	        driver.switchTo().frame(frame);
	        driver.findElement(By.xpath("(//span[@id='incident_choice_actions'])/following::button")).click();
	        driver.switchTo().defaultContent();
	        WebElement frame1 = shadow.findElementByXPath("//iframe[@title='Main Content']");
	        driver.switchTo().frame(frame1);
	        incidentNo = driver.findElement(By.id("incident.number")).getAttribute("value");
	        System.out.println("incidentNo : " +incidentNo);
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    }
	}

