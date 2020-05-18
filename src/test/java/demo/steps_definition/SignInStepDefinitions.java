package demo.steps_definition;

import demo.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignInStepDefinitions {
    SignInPage signInPage = new SignInPage();

    @Given("User is on E-money Sign In Page")
    public void userIsOnEMoneySignInPage() {
        boolean actual = signInPage.isOnSignInPage();
        Assert.assertTrue(actual);
    }

    @Then("User is in homepage")
    public void userIsInHomepage() {
        boolean actual = signInPage.isOnHomePage();
        Assert.assertTrue(actual);
    }

    //SignInButton

    @When("User input email/phone {string} on email or phone text field")
    public void userInputEmailOnEmailOrPhoneTextField(String data) {
        signInPage.inputEmailorPhone(data);
    }

    @And("User input password {string} on password text field")
    public void userInputPasswordOnPasswordTextField(String password) {
        signInPage.inputPassword(password);
    }

    @And("User click sign in button on Sign In page")
    public void userClickSignInButtonOnSignInPage() {
        signInPage.clickSignIn();
    }




    @Then("User see error that email or phone is not the format")
    public void userSeeErrorThatEmailOrPhoneIsNotTheFormat() {
        String text = signInPage.checkInputMessage();
        Assert.assertTrue(text.contains("Wrong Email or Phone Format"));
    }

    @Then("User see error that password is not the format")
    public void userSeeErrorThatPasswordIsNotTheFormat() {
        String text = signInPage.checkInputMessage();
        Assert.assertTrue(text.contains("Password MUST have at least 8 characters, 1 lower case letter, 1 upper case letter, 1 number, 1 special character and MAY NOT have whitespace"));
    }

    @Then("User see error that email or phone is wrong")
    public void userSeeErrorThatEmailOrPhoneIsWrong() {
        String text = signInPage.checkErrorMessage();
        Assert.assertTrue(text.contains("email or phone not registered"));
    }

    @Then("User see error that password is wrong")
    public void userSeeErrorThatPasswordIsWrong() {
        String text = signInPage.checkErrorMessage();
        Assert.assertTrue(text.contains("wrong password"));
    }

    @Then("User see error that email or phone field is blank")
    public void userSeeErrorThatEmailOrPhoneFieldIsBlank() {
        String text = signInPage.checkInputMessage();
        Assert.assertTrue(text.contains("This Field Cannot Be Empty"));
    }

    @Then("User see error that password field is blank")
    public void userSeeErrorThatPasswordFieldIsBlank() {
        String text = signInPage.checkInputMessage();
        Assert.assertTrue(text.contains("This Field Cannot Be Empty"));
    }

    //SignUpButton

    @When("User click sign up button on Sign In Page")
    public void userClickSignUpButtonOnSignInPage() {
        signInPage.clickSignUp();
    }

    @Then("User is in Sign Up Page")
    public void userIsInSignUpPage() {
        boolean actual = signInPage.isOnSignUpPage();
        Assert.assertTrue(actual);
    }




}
