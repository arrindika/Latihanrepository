package demo.steps;

import demo.pages.TopUpHomepage;
import demo.webdrivers.AndroidDriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.security.Key;

public class TopUpStepsDefinition {

    TopUpHomepage topUpHomepage = new TopUpHomepage();

    @Given("User is on top up e-money homepage")
    public void userIsOnTopUpEMoneyHomepage() {
        topUpHomepage.isoOnPage();
    }

    @Then("User see the option top up amount")
    public void userSeeTheOptionTopUpAmount() {
        topUpHomepage.checkTopUpOption();
    }

    @Then("User see error message on card number text field")
    public void userSeeErrorMessageOnCardNumberTextField() {
        topUpHomepage.checkCardNumber();
    }

    @And("User see the option top up is not displayed")
    public void userSeeTheOptionTopUpIsNotDisplayed() {
        boolean result = topUpHomepage.checkTopUpOption();
        Assert.assertEquals(false, result);
    }

    @And("User chose {string} on top up amount option")
    public void userChoseOnTopUpAmountOption(String Keyword) {
        topUpHomepage.ClickTopUpOption(Keyword);
    }

    @And("User choose {string} payment option")
    public void userChoosePaymentOption(String Keyword) {
        topUpHomepage.choosePaymentMethod(Keyword);
    }

    @And("User click pay button")
    public void userClickPayButton() {
        topUpHomepage.clickPay();
    }

    @Then("User see top up payment is successfull")
    public void userSeeTopUpPaymentIsSuccessfull() {
        String text = topUpHomepage.checkDialogMessage().toLowerCase();
        Assert.assertTrue(text.contains("success"));
        topUpHomepage.clickOkDialogBox();
    }

    @And("User click cancel button")
    public void userClickCancelButton() {
        topUpHomepage.clickCancel();
    }

    @Then("User error message that wallet is less than total payment")
    public void userErrorMessageThatWalletIsLessThanTotalPayment() {
        String text = topUpHomepage.checkDialogMessage();
        Assert.assertTrue(text.contains("Your wallet balance is not enough for this transaction"));
        topUpHomepage.clickOkDialogBox();
    }

    @And("User see payment details with total payment is {string}")
    public void userSeePaymentDetailsWithTotalPaymentIs(String Keyword) {
        Assert.assertEquals(topUpHomepage.checkTotalPayment(), Keyword);
    }

    @When("User input {string} on card number text field")
    public void userInputOnCardNumberTextField(String Keyword) {
        topUpHomepage.inputCardNumberText(Keyword);
    }


    @And("The option top up amount is not displayed")
    public void theOptionTopUpAmountIsNotDisplayed() {
        topUpHomepage.checkTopUpOption();
    }

    @Then("User see error message {string} on card number text field")
    public void userSeeErrorMessageOnCardNumberTextField(String Keyword) {
        String getText = topUpHomepage.checkCardNumber();
        Assert.assertEquals(getText, Keyword);
    }

    @And("User click history page button on main page")
    public void userClickHistoryPageButtonOnMainPage() {
        topUpHomepage.clickHistoryPage();
    }

}
