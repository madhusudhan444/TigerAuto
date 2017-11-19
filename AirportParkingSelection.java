package TigerAirAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AirportParkingSelection {

	public void mairportParkingSelect(WebDriver obj) 
	
	{
		// TODO Auto-generated method stub

		obj.findElement(By.linkText("park my car\n                                from\n                                \n                                    $\n                                    87.00")).click();
		obj.findElement(By.xpath("//label[@for='AddParkingCheckbox']")).click();
//		obj.findElement(By.xpath("//*[@id=\"modalairportparking\"]/div/h1/img']")).click();
		
		obj.findElement(By.cssSelector("#modalairportparking > div:nth-child(1) > h1:nth-child(1) > img:nth-child(2)")).click();
		
		
	}

}
