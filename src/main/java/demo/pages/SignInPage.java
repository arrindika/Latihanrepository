package demo.pages;

import demo.webdrivers.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    public boolean isOnSignInPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btnSignIn")))
                .isDisplayed();
    }
    public boolean isOnHomePage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menuHome")))
                .isDisplayed();
    }
    public boolean isOnSignUpPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tvTitle")))
                .isDisplayed();
    }

    public void inputEmailorPhone(String data) {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("edtEmailOrPhone")).sendKeys(data);
    }

    public void inputPassword(String password) {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("edtPassword")).sendKeys(password);
    }

    public void clickSignIn() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("btnSignIn")).click();
    }

    public void clickSignUp() {
        AndroidDriverInstance.androidDriver
                .findElement(By.id("btnSignup")).click();
    }

    public String checkErrorMessage() {
        WebElement message = AndroidDriverInstance.androidDriver.findElement(By.id("android:id/message"));
        return message.getAttribute("text");
    }

    public String checkInputMessage() {
        WebElement toastView = AndroidDriverInstance.androidDriver.findElement(By.id("textinput_error"));
        return toastView.getAttribute("text");
    }

}
