package demo.webdrivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
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
        caps.setCapability("udid","ce051605e305e41205");
        caps.setCapability("autoGrandPermissions",true);
        caps.setCapability("app",
                System.getProperty("user.dir") + File.separator + "APP" + File.separator + "SigmaCard_v0.5.apk");
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
