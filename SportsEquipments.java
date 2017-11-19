package TigerAirAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SportsEquipments {

	public void OnePieceSportsEquip(WebDriver obj)
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("//div[1]/div[4]/form/div[5]/div/div[1]/div[6]/div/div[2]/div[1]/div[3]/div[2]/div[1]")).click();
			
	}

	public void TwoPieceSportsEquip(WebDriver obj)
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("//div[1]/div[4]/form/div[5]/div/div[1]/div[6]/div/div[2]/div[1]/div[3]/div[2]/div[2]")).click();
			
	}

	
	public void ThreePieceSportsEquip(WebDriver obj)
	{
		// TODO Auto-generated method stub

		obj.findElement(By.xpath("//div[1]/div[4]/form/div[5]/div/div[1]/div[6]/div/div[2]/div[1]/div[3]/div[2]/div[3]")).click();
			
	}

	
}
