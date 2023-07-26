package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ViewLogs extends DesiredCapabilitiesOfDevice{
	@Test
	public void ViewLogs_Copy_Clear() throws InterruptedException {
		 Thread.sleep(3000);
			WebElement se=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CLOSE\"]"));//Remove this code if"Can't perform update Google play store pop up is not showing after application opens"
		       se.click();	
		       Thread.sleep(3000);
		WebElement seven33= driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Log\"]"));
        seven33.click();
        Thread.sleep(2100);
        WebElement seven03= driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"copy\"]"));
        seven03.click();
        Thread.sleep(2100);
        WebElement seven3= driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"clear\"]"));
        seven3.click();
        }

}
