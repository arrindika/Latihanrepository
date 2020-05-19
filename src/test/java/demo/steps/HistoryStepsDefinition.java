package demo.steps;

import demo.pages.DetailTransactionPage;
import demo.pages.TopUpHomepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HistoryStepsDefinition {

    TopUpHomepage topUpHomepage = new TopUpHomepage();
    DetailTransactionPage details = new DetailTransactionPage();

    @And("User click completed tab transaction on history page")
    public void userClickCompletedTabTransactionOnHistoryPage() {
        topUpHomepage.clickCompletedTab();

    }

    @And("User click the last completed transaction on history completed tab transaction page")
    public void userClickTheLastCompletedTransactionOnHistoryCompletedTabTransactionPage() {
        topUpHomepage.clickLastTransaction();
    }

    @Then("User see {string} status in detail transaction page")
    public void userSeeStatusInDetailTransactionPage(String completed) {
        String actual = details.CompletedStatus();
        Assert.assertEquals(completed, actual);
    }
}
