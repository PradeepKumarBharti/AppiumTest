package com.iso;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSTest {
	static IOSDriver<IOSElement> app = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		String URL = "https://0.0.0.0:4723/wd/hub";
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("app", "/Users/pbharti/Downloads/ipa_ipa/p/kiip-qa-v3.app");
			// cap.setCapability("udid", "1175972e391efe5857d4777bbdba0ef5fa7d2e44");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
			cap.setCapability(IOSMobileCapabilityType.SIMPLE_ISVISIBLE_CHECK, "true");

			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4");
			cap.setCapability(MobileCapabilityType.PLATFORM, "iOS");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");

			cap.setCapability("wdaLocalPort", 8100);
			cap.setCapability("noReset", true);

			cap.setCapability("newCommandTimeout", 60 * 600);

			cap.setCapability("--session-override", true);
			cap.setCapability("--show-ios-log", true);
			System.out.println("\n Launching the app in device....\n");

			app = new IOSDriver<IOSElement>(new URL(URL), cap);
			Thread.sleep(9000);
			app.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void test() {
		try {
 int asfbajbf;
			app.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Native View\"]")).click();
			Thread.sleep(500);

			app.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Kiip QA 3.0.0\"]")).click();
			Thread.sleep(500);
			
			app.findElement(By.xpath("//XCUIElementTypeButton[@name=\"show native view\"]")).click();
			Thread.sleep(500);

			

			System.out.println("Here...");

			System.out.println("Here...");

			System.out.println("Here...");

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("sdjkgdklsnvliasbvabdsjkv");

		System.out.println("Here...");

		System.out.println("Here...");
	}

}
