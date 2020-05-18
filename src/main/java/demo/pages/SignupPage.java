package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdrivers.AndroidDriverInstance.androidDriver;

public class SignupPage {
    public boolean isOnSignupPage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement signupLabel = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("nsv_signup")));
        return signupLabel.isDisplayed();
    }

    public void insertFullName(String fullName) {
        androidDriver.findElement(By.id("edtFullName")).sendKeys(fullName);

    }

    public void insertEmail(String emailAddress) {
        androidDriver.findElement(By.id("edtEmail")).sendKeys(emailAddress);
    }

    public void insertPhoneNumber(String phoneNumber) {
        androidDriver.findElement(By.id("edtPhone")).sendKeys(phoneNumber);
    }

    public void insertPassword (String password) {
        androidDriver.findElement(By.id("edtPassword")).sendKeys(password);
    }

    public void insertConfirmPass (String confPass) {
        androidDriver.findElement(By.id("edtConfirmPassword")).sendKeys(confPass);
    }

    public void signUpBtn() {
        androidDriver.findElement(By.id("btnSignup")).click();
    }

    public boolean errorMessage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement errorMessage = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("textinput_error")));
        return errorMessage.isDisplayed();
    }

    public String successMessage(){
        waitAbit(3000);
        WebElement successMessage = androidDriver.findElement(By.id("alertTitle"));
        return successMessage.getText();
    }

    public void clickOK(){
        androidDriver.findElement(By.xpath("//android.widget.Button")).click();
    }

    public void waitAbit(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
