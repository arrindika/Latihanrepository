package demo.steps;

import demo.pages.OtpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class OTPStepsDefinition {
    OtpPage otpPage = new OtpPage();
    @Then("User will see otp page")
    public void userWillSeeOtpPage() {
        boolean actual5 = otpPage.isOnOtpPage();
        Assert.assertTrue(actual5);
    }

    @And("User input Otp code {string} on the verification page")
    public void userInputOtpCodeOnTheVerificationPage(String otpCode) {
        otpPage.insertOtpCode(otpCode);
    }
}
