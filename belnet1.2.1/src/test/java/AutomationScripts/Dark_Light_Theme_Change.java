package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Dark_Light_Theme_Change extends DesiredCapabilitiesOfDevice{
	@Test
	public void scrol() throws InterruptedException {
		WebElement se=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CLOSE\"]"));
	       se.click();	
 	   Thread.sleep(3000);
	WebElement e3=driver.findElement(By.xpath("//android.widget.ImageView[@index=\"8\"]"));
    e3.click();
    Thread.sleep(5000);
    WebElement e7=driver.findElement(AppiumBy.accessibilityId("Contributor exit node\n" +
            "17 Nodes"));
    e7.click();
    Thread.sleep(2000);
    String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward(3)"; //.scrollIntoView(new UiSelector().description(\"6o5ushgtbuaowsmt614iy1ibtzia7mt87ngqubdkwforid1i6pro.bdx\n" +
            //"Canada\")";
    Thread.sleep(5000);
   WebElement seven0=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement));
   Thread.sleep(5000);
   String scrollElement2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward()"; //.scrollIntoView(new UiSelector().description(\"6o5ushgtbuaowsmt614iy1ibtzia7mt87ngqubdkwforid1i6pro.bdx\n" +
   //"Canada\")";
Thread.sleep(5000);
WebElement seven10=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement2));
Thread.sleep(5000);
}}