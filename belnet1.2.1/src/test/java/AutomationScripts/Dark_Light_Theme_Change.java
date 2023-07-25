package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Dark_Light_Theme_Change extends DesiredCapabilitiesOfDevice{
	@Test
	public void DarkandLightThemeChagne() throws InterruptedException {
		 Thread.sleep(3000);
		WebElement se=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CLOSE\"]"));//Remove this code if"Can't perform update Google play store pop up is not showing after application opens"
	       se.click();	
 	   Thread.sleep(3000);
	for(int i=0;i<=9;i++) {
		WebElement seven10=driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")); // Click on Light Theme button
	    seven10.click();
	    WebElement seven311=driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")); // Click on Dark Theme button
	    seven311.click();
}
	}}