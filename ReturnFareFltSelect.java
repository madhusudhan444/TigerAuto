package TigerAirAutomationProject;


import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class ReturnFareFltSelect

{

    public void RtnLtFr(WebDriver obj)
    
    {

        obj.findElement(By.cssSelector("td.js-fare-selection.flight-price")).click();
        obj.findElement(By.xpath("//table[@id='table-1']/tbody/tr[2]/td[3]")).click();
        obj.findElement(By.id("ContinueBtn")).click();
       
    }
    

	 public void RtnExpFr(WebDriver obj)
	    
   {

       obj.findElement(By.xpath("//table[@id='table-0']/tbody/tr[2]/td[4]")).click();
       obj.findElement(By.xpath("//table[@id='table-1']/tbody/tr[2]/td[4]")).click();
       obj.findElement(By.id("ContinueBtn")).click();
	       
   }

	 public void RtnLtAndExpFr(WebDriver obj)
	    
	   {

	       obj.findElement(By.xpath("//table[@id='table-0']/tbody/tr[2]/td[3]")).click();
	       obj.findElement(By.xpath("//table[@id='table-1']/tbody/tr[2]/td[4]")).click();
	       obj.findElement(By.id("ContinueBtn")).click();
		       
	   }
	 
	 
	 
	 
	 
	 
}
