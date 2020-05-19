package demo.pages;

import static demo.webdrivers.AndroidDriverInstance.androidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailTransactionPage {
    public String CompletedStatus(){
        WebDriverWait wait = new WebDriverWait(androidDriver,30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtHistoryStatus"))).getText();
    }
}
