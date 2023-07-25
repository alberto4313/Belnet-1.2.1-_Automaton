package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ExiteNodeSwitch extends DesiredCapabilitiesOfDevice {
	int a=0;

	@Test(priority=2)
	public void DarkandLightThemeChagne() {
		 
	for(int i=0;i<=9;i++) {
		WebElement seven10=driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")); // Click on Light Theme button
	    seven10.click();
	    WebElement seven311=driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")); // Click on Dark Theme button
	    seven311.click();
}
	}
       @Test(priority=1)
	public void ContributorExiteNodeSwicth() throws InterruptedException {
    	   Thread.sleep(10000);
    	   WebElement se=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CLOSE\"]"));
	       se.click();	
    	   Thread.sleep(3000);
    	   for(int i=1;i<=10;i++) {
    	   WebElement e9=driver.findElement(By.xpath("//android.widget.ImageView[@index=\"8\"]"));
           e9.click();
           Thread.sleep(3000);
           WebElement e11=driver.findElement(AppiumBy.accessibilityId("Contributor exit node\n" +
                   "17 Nodes"));
           e11.click();
           String scrollElement1 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward()"; //.scrollIntoView(new UiSelector().description(\"6o5ushgtbuaowsmt614iy1ibtzia7mt87ngqubdkwforid1i6pro.bdx\n" +
           //"Canada\")";
   Thread.sleep(3000);
  WebElement seve0=driver.findElement(new AppiumBy.ByAndroidUIAutomator(scrollElement1));
  Thread.sleep(3000);
           Thread.sleep(3000);
           WebElement seven0190=driver.findElement(AppiumBy.accessibilityId("c6u8ef15u877agxbi435iixuo4zrfq1kdk3x56uw1tmsnh3hzt1o.bdx\n" +
                   "USA"));
           seven0190.click();
           Thread.sleep(3000);
           WebElement seven303= driver.findElement(By.xpath("//android.view.View[@index=\"4\"]"));
           seven303.click();
           Thread.sleep(21000);
           seven303.click();
           Thread.sleep(3000);
           a++;
           System.out.println(a+"Times Node Changed");
           }
           WebElement e8=driver.findElement(By.xpath("//android.widget.ImageView[@index=\"8\"]"));
           e8.click();
           Thread.sleep(5000);
           WebElement e7=driver.findElement(AppiumBy.accessibilityId("Contributor exit node\n" +
                   "17 Nodes"));
           e7.click();
           Thread.sleep(2000);
           String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward()"; //.scrollIntoView(new UiSelector().description(\"6o5ushgtbuaowsmt614iy1ibtzia7mt87ngqubdkwforid1i6pro.bdx\n" +
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



