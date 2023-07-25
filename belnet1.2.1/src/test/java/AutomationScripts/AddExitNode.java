package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddExitNode extends DesiredCapabilitiesOfDevice{
	
	@Test
	public void Addexitnode() throws InterruptedException {
		Thread.sleep(3000);
		WebElement se=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CLOSE\"]"));//Remove this code if"Can't perform update Google play store pop up is not showing after application opens"
	       se.click();	
  	   Thread.sleep(2000);
  	   WebElement ew=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Add Exit Node\"]"));
  	   ew.click();
  	   Thread.sleep(2000);
  	  WebElement ee=driver.findElement(By.className("android.widget.EditText"));
  	   ee.click();
  	 Thread.sleep(2000);
       ee.sendKeys("iyu3gajuzumj573tdy54sjs7b94fbqpbo3o44msrba4zez1o4p3o.bdx");
		Thread.sleep(4000);
		WebElement re=driver.findElement(By.xpath("//android.view.View[@content-desc=\"OK\"]"));
		re.click();
		Thread.sleep(24000);
	    WebElement seven30=driver.findElement(By.xpath("//android.widget.ImageView[@index=\"5\"]"));
	    Thread.sleep(5000);
        seven30.click();
        Thread.sleep(2000);
   	   WebElement ex=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Add Exit Node\"]"));
   	   ex.click();
   	   Thread.sleep(2000);
   	  WebElement ey=driver.findElement(By.className("android.widget.EditText"));
   	   ey.click();
   	 Thread.sleep(2000);
        ey.sendKeys("a6iiyy3c4qsp8kdt49ao79dqxskd81eejidhq9j36d8oodznibqy.bdx");
 		Thread.sleep(4000);
 		WebElement rx=driver.findElement(By.xpath("//android.view.View[@content-desc=\"OK\"]"));
 		rx.click();
 		Thread.sleep(24000);
 	    WebElement seven3=driver.findElement(By.xpath("//android.widget.ImageView[@index=\"5\"]"));
 	    Thread.sleep(5000);
         seven3.click();
         Thread.sleep(2000);
     	   WebElement eu=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Add Exit Node\"]"));
     	   eu.click();
     	   Thread.sleep(2000);
     	  WebElement ev=driver.findElement(By.className("android.widget.EditText"));
     	   ev.click();
     	 Thread.sleep(2000);
          ev.sendKeys("snoq7arak4d5mkpfsg69saj7bp1ikxyzqjkhzb96keywn6iyhc5y.bdx");
   		Thread.sleep(4000);
   		WebElement rr=driver.findElement(By.xpath("//android.view.View[@content-desc=\"OK\"]"));
   		rr.click();
   		Thread.sleep(24000);
   	    WebElement seven31=driver.findElement(By.xpath("//android.widget.ImageView[@index=\"5\"]"));
   	    Thread.sleep(5000);
           seven31.click();
	}

}
