package demo.steps_definition;

import demo.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfilePageStepDefinitions {

    ProfilePage profilePage = new ProfilePage();

    @Given("User is On Profile Page")
    public void userIsOnProfilePage() {
        boolean actual = profilePage.isOnProfilePage();
        Assert.assertTrue(actual);
    }
    @And("User click Profile Button on Homepage")
    public void userClickProfileButtonOnHomepage() {
        profilePage.clickProfilePage();
    }

    //LogOut

    @When("User click Log Out on Profile Page")
    public void userClickLogOutOnProfilePage() {
        profilePage.clickLogOut();
    }

    @And("User click yes for Log Out confirmation")
    public void userClickYesForLogOutConfirmation() {
        profilePage.clickConfirmYes();
    }

    @And("User click cancel for Log Out confirmation")
    public void userClickCancelForLogOutConfirmation() {
        profilePage.clickConfirmCancel();
    }

    //Navigation

    @When("User click Home Button on Profile Page")
    public void userClickHomeButtonOnProfilePage() {
        profilePage.clickHomeButton();
    }

    @When("User click History Button on Profile Page")
    public void userClickHistoryButtonOnProfilePage() {
        profilePage.clickHistoryButton();
    }

    @Then("User is on History Page")
    public void userIsOnHistoryPage() {
        boolean actual = profilePage.isOnHistoryPage();
        Assert.assertTrue(actual);
    }

    //ChangePassword

    @When("User click Change Password on Profile Page")
    public void userClickChangePasswordOnProfilePage() {
        profilePage.clickChangePassword();
    }


    @And("User input new password {string} on new password text field")
    public void userInputNewPasswordOnNewPasswordTextField(String pass) {
        profilePage.newPassword(pass);
    }

    @And("User input confirm password {string} on confirm password text field")
    public void userInputConfirmPasswordOnConfirmPasswordTextField(String pass) {
        profilePage.confirmPassword(pass);
    }

    @And("User click change password button on change password page")
    public void userClickChangePasswordButtonOnChangePasswordPage() {
        profilePage.clickChangePasswordButton();
    }

    @Then("success change password")
    public void successChangePassword() {
        String text = profilePage.checkMessage();
        Assert.assertTrue(text.contains("success"));
    }

    @Then("User see error that invalid format password")
    public void userSeeErrorThatInvalidFormatPassword() {
        String text = profilePage.checkInputNewPassword();
        Assert.assertTrue(text.contains("Password MUST have at least 8 characters, 1 lower case letter, 1 upper case letter, 1 number, 1 special character and MAY NOT have whitespace"));
    }

    @Then("User see error that confirm password doesn't match")
    public void userSeeErrorThatConfirmPasswordDoesnTMatch() {
        String text = profilePage.checkInputConfirmPasswor();
        Assert.assertTrue(text.contains("Password and Confirm password does not match"));
    }


    @Then("User see error that confirm password is empty")
    public void userSeeErrorThatConfirmPasswordIsEmpty() {
        String text = profilePage.checkInputNewPassword();
        Assert.assertTrue(text.contains("This Field Cannot Be Empty"));
    }

    @And("User see error that new password is empty")
    public void userSeeErrorThatNewPasswordIsEmpty() {
        String text = profilePage.checkInputConfirmPasswor();
        Assert.assertTrue(text.contains("This Field Cannot Be Empty"));
    }
}
