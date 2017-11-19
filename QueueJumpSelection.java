package TigerAirAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QueueJumpSelection {

	public void rtnQueueJumpSelect(WebDriver obj) 
	
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("//div[@class='extras-maincontent']/div[2]/div[2]/a")).click();
		obj.findElement(By.xpath("//*[@for='multiSelection']")).click();
		obj.findElement(By.xpath("//*[@class='close-button']")).click();
	}
	
	
	public void oneWayQueueJumpSelect(WebDriver obj) 
	
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("//div[@class='extras-maincontent']/div[2]/div[2]/a")).click();
		obj.findElement(By.xpath("//*[@for='qjchk']")).click();
		obj.findElement(By.xpath("//*[@class='close-button']")).click();
	}


}
