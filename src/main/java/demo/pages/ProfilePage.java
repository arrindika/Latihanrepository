package demo.pages;

import demo.webdrivers.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    public boolean isOnProfilePage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnChangePassword")))
                .isDisplayed();
    }
    public boolean isOnHistoryPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.sigmacard:id/srlHistory")))
                .isDisplayed();
    }

    public void clickProfilePage() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("menuProfile")).click();
    }
    public void clickLogOut() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("btnLogout")).click();
    }
    public void clickConfirmYes() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("android:id/button1")).click();
    }
    public void clickConfirmCancel() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("android:id/button2")).click();
    }
    public void clickHomeButton() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("menuHome")).click();
    }
    public void clickHistoryButton() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("menuHistory")).click();
    }
    public void clickChangePassword() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("btnChangePassword")).click();
    }
    public void clickChangePasswordButton() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("btnChangePassword")).click();
    }
    public void newPassword(String data) {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("edtNewPassword")).sendKeys(data);
    }
    public void confirmPassword(String data) {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("edtConfirmNewPassword")).sendKeys(data);
    }
    public String checkMessage() {
        WebElement message = AndroidDriverInstance.androidDriver.findElement(By.id("android:id/message"));
        return message.getAttribute("text");
    }

    public String checkInputNewPassword() {
        WebElement toastView = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView\n"));
        return toastView.getAttribute("text");
    }
    public String checkInputConfirmPasswor() {
        WebElement toastView = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView\n"));
        return toastView.getAttribute("text");
    }
}


