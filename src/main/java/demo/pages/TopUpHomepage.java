package demo.pages;

import demo.webdrivers.AndroidDriverInstance;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopUpHomepage {

    public boolean isoOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("edtCardNumber"))).isDisplayed();
    }

    public void inputCardNumberText(String Keyword) {
        AndroidElement InputText = AndroidDriverInstance.androidDriver.findElement(MobileBy.id("edtCardNumber"));
        InputText.click();
        InputText.sendKeys(Keyword);
    }

    public String checkCardNumber() {
        return AndroidDriverInstance.androidDriver.findElement(MobileBy.id("textinput_error")).getText();
    }

    public boolean checkTopUpOption() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 5);
        return wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]\n"))).isDisplayed();
    }

    public void ClickTopUpOption(String Keyword) {

        switch (Keyword) {
            case "10000":
                AndroidDriverInstance.androidDriver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout\n"))
                        .click();
                break;
            case "20000":
                AndroidDriverInstance.androidDriver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.RelativeLayout\n"))
                        .click();
                break;
            case "50000":
                AndroidDriverInstance.androidDriver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[3]/android.widget.RelativeLayout\n"))
                        .click();
                break;
            case "100000":
                AndroidDriverInstance.androidDriver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[4]/android.widget.RelativeLayout\n"))
                        .click();
                break;
            case "150000":
                AndroidDriverInstance.androidDriver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[5]/android.widget.RelativeLayout\n"))
                        .click();
                break;
            case "200000":
                AndroidDriverInstance.androidDriver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[6]/android.widget.RelativeLayout\n"))
                        .click();
                break;
        }
    }

    public void choosePaymentMethod(String Keyword) {

        AndroidDriverInstance.androidDriver.findElement(MobileBy.id("txtPaymentMethod")).click();

        if (Keyword.contains("Wallet Balance")){
            AndroidDriverInstance.androidDriver.findElement(MobileBy.id("btnMethodWallet")).click();
        } else if (Keyword.contains("Bank Transfer")) {
            AndroidDriverInstance.androidDriver.findElement(MobileBy.id("btnMethodBank")).click();
        } else if (Keyword.contains("Merchant")){
            AndroidDriverInstance.androidDriver.findElement(MobileBy.id("btnMethodMerchant")).click();
        }
    }

    public void clickPay() {
        AndroidDriverInstance.androidDriver.findElement(MobileBy.id("btnPay")).click();
        waitForAnimation();
    }


    public String checkTotalPayment() {
        return AndroidDriverInstance.androidDriver.findElement(MobileBy.id("txtPaymentTotal")).getText();
    }

    public void clickCancel() {
        AndroidDriverInstance.androidDriver.findElement(MobileBy.id("btnPayClose")).click();
    }

    public String checkDialogMessage() {
        return AndroidDriverInstance.androidDriver.findElement(MobileBy.id("android:id/message")).getText();
    }

    public void waitForAnimation() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOkDialogBox(){
        AndroidDriverInstance.androidDriver.findElement(MobileBy.id("android:id/button1")).click();
    }

    public void clickHistoryPage(){
        AndroidDriverInstance.androidDriver.findElement(By.id("menuHistory")).click();
    }

    public void clickCompletedTab(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc='Completed']")).click();
    }

    public void clickLastTransaction(){
        AndroidDriverInstance.androidDriver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")).click();
    }
}

