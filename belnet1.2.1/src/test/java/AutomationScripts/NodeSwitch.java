package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class NodeSwitch extends DesiredCapabilitiesOfDevice{
	public void Switch() throws InterruptedException {
		
		WebElement se=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CLOSE\"]"));
	       se.click();	
 	   Thread.sleep(3000);
 	   
 	   WebElement e9=driver.findElement(By.xpath("//android.widget.ImageView[@index=\"8\"]"));
        e9.click();
        Thread.sleep(3000);
        WebElement e90=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Beldex Official\r\n"
        		+ "3 Nodes\"]"));
        Thread.sleep(3000);
        WebElement e80=driver.findElement(AppiumBy.accessibilityId("iyu3gajuzumj573tdy54sjs7b94fbqpbo3o44msrba4zez1o4p3o.bdx\r\n"
        		+ "Netherlands"));
        e80.click();
        WebElement seven303= driver.findElement(By.xpath("//android.view.View[@index=\"4\"]"));
        seven303.click();
        Thread.sleep(21000);
        seven303.click();
        Thread.sleep(3000);
        WebElement e79=driver.findElement(By.xpath("//android.widget.ImageView[@index=\"8\"]"));
        e79.click();
        Thread.sleep(3000);
        WebElement e78=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Beldex Official\r\n"
        		+ "3 Nodes\"]"));
        Thread.sleep(3000);
        WebElement e77=driver.findElement(AppiumBy.accessibilityId("a6iiyy3c4qsp8kdt49ao79dqxskd81eejidhq9j36d8oodznibqy.bdx\r\n"
        		+ "Netherlands"));
        e77.click();
        WebElement seven33= driver.findElement(By.xpath("//android.view.View[@index=\"4\"]"));
        seven33.click();
        Thread.sleep(21000);
        seven33.click();
        Thread.sleep(3000);
        WebElement e76=driver.findElement(By.xpath("//android.widget.ImageView[@index=\"8\"]"));
        e76.click();
        Thread.sleep(3000);
        WebElement e75=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Beldex Official\r\n"
        		+ "3 Nodes\"]"));
        Thread.sleep(3000);
        WebElement e74=driver.findElement(AppiumBy.accessibilityId("snoq7arak4d5mkpfsg69saj7bp1ikxyzqjkhzb96keywn6iyhc5y.bdx\r\n"
        		+ "France"));
        e74.click();
        }

}
