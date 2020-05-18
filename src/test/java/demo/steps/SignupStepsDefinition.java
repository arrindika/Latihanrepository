package demo.steps;

import demo.pages.SignupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignupStepsDefinition {
    SignupPage signupPage = new SignupPage();
    @And("User is at Sign Up page")
    public void userIsAtSignUpPage() {
        boolean actual2 = signupPage.isOnSignupPage();
        Assert.assertTrue(actual2);
    }

    @When("User insert {string} in Fullname text field")
    public void userInsertInFullnameTextField(String fullName) {
        signupPage.insertFullName(fullName);
    }

    @And("User input email {string}")
    public void userInputEmail(String emailAddress) {
        signupPage.insertEmail(emailAddress);
    }

    @And("User input phone number {string}")
    public void userInputPhoneNumber(String phoneNumber) {
        signupPage.insertPhoneNumber(phoneNumber);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        signupPage.insertPassword(password);
    }

    @And("User input confirm password {string}")
    public void userInputConfirmPassword(String conPassword) {
        signupPage.insertConfirmPass(conPassword);
    }

    @And("User click sign up button")
    public void userClickSignUpButton() {
        signupPage.signUpBtn();

    }

    @Then("User will see error message")
    public void userWillSeeErrorMessage() {
        boolean actual = signupPage.errorMessage();
        Assert.assertTrue(actual);
    }

    @Then("User will see {string} message alert to verify email address")
    public void userWillSeeMessageAlertToVerifyEmailAddress(String Succed) {
        String message = signupPage.successMessage();
        Assert.assertEquals(Succed, message);

    }

    @And("User click ok button to insert otp code in otp page")
    public void userClickOkButtonToInsertOtpCodeInOtpPage() {
        signupPage.clickOK();
    }
}
