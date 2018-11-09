package com.iso;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunIOS_Simulator {

	public static final String URL = "https://127.0.0.1:4723/wd/hub";

	public static void main(String[] args) throws Exception {

	//	DesiredCapabilities capabilities = pk1();

		DesiredCapabilities capabilities =setIOSCap();
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL(URL), capabilities);
		
		try {
			Thread.sleep(9000);
		System.out.println(driver.findElement(By.xpath("sdfsd")));
		}catch(Exception e) {
			e.printStackTrace();
		}

		/**
		 * Test Actions here...
		 */

		driver.quit();
	}

	private static DesiredCapabilities pk1() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone");
		capabilities.setCapability("platformVersion", "10.0");
		capabilities.setCapability("app", "/Users/pbharti/Downloads/kiip-qa-v3.ipa");
		capabilities.setCapability("browserName", "");
		// capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("appiumVersion", "1.8.0");
		return capabilities;
	}

	public static DesiredCapabilities setIOSCap() {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("realDeviceLogger", "/usr/local/lib/node_modules/deviceconsole/deviceconsole");
		// capabilities.setCapability("browserName", "Safari");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "10.3");
		capabilities.setCapability("deviceName", "iPhone 5"); // Simulator or  iphone , ipad
		capabilities.setCapability("udid", "1175972e391efe5857d4777bbdba0ef5fa7d2e44");
		capabilities.setCapability("bundleId", "enterprise.kiip.test.kiip-qa-v3");
		capabilities.setCapability("newCommandTimeout", 600*60);
		//capabilities.setCapability("app", "/Users/pbharti/Downloads/ipa_ipa/kiip-qa-v3.ipa");
		capabilities.setCapability("showIOSLog", true);
		capabilities.setCapability("showIOSLog", true);
		capabilities.setCapability("bootstrapPath",
				"/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent");
		capabilities.setCapability("agentPath",
				"/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/WebDriverAgent.xcodeproj");

		return capabilities;
	}

	public static DesiredCapabilities setIOSCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.2.6");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ipad"); // // Simulator or  iphone
		capabilities.setCapability(MobileCapabilityType.UDID, "7a6f58e1246ee896af170b07662265d4ef0ac763");
		capabilities.setCapability(MobileCapabilityType.APP, "enterprise.kiip.test.kiip-qa-v3");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);

		return capabilities;
	}
}
