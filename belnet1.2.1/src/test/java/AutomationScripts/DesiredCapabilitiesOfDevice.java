package AutomationScripts;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DesiredCapabilitiesOfDevice {
	AndroidDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup() {
		try  {
		 DesiredCapabilities dc= new DesiredCapabilities();
	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , "12");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");// This value is device specific open CMD and type adb.exe devices
	        dc.setCapability(MobileCapabilityType.NO_RESET, "true");
	        dc.setCapability("udid","emulator-5554");
	        dc.setCapability("appPackage" , "io.beldex.belnet");//appPackage can be found using APKInfo application
	        dc.setCapability("appActivity" , "io.beldex.belnet.MainActivity");//appActivity can be found using APKInfo application
	        URL d =new URL("http://localhost:4723/wd/hub");
	        driver = new AndroidDriver(d,dc); 
		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is :"+exp.getMessage());
			exp.printStackTrace();
		}
	
	}
	@AfterTest
	public void teardown() {}}


