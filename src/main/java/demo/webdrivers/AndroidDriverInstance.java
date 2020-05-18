package demo.webdrivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {

    public static AndroidDriver<AndroidElement> androidDriver;
    public static void initializeDriver(){
        String appiumUrl = "http://127.0.0.1:4723/wd/hub/";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","8.1.0");
        caps.setCapability("deviceName","device");
        caps.setCapability("udid","emulator-5554");
        caps.setCapability("autoGrandPermissions",true);
        caps.setCapability("app", "/Users/bhaskaram/IdeaProjects/Project-X2/APP/SigmaCard_v0.3.apk");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("newCommandTimeout", 120);
        try {
            androidDriver = new AndroidDriver<>(new URL(appiumUrl), caps);
            androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public static void quitDriver(){
        androidDriver.quit();
    }

}
