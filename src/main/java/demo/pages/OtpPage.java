package demo.pages;

import demo.webdrivers.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdrivers.AndroidDriverInstance.androidDriver;

public class OtpPage {
    public boolean isOnOtpPage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement otpLabel = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("otpView")));
        return otpLabel.isDisplayed();
    }

    public void insertOtpCode(String otpCodes){
        AndroidElement insertOtp = AndroidDriverInstance.androidDriver.findElement(By.id("otpView"));
        insertOtp.sendKeys(otpCodes);
    }
}
