package net.lobster.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

/**
 * Created by yangshutao on 2017/2/20.
 */
public class AtmStep {
    @Given("^我的账户中有余额\"([^\"]*)\"元$")
    public void 我的账户中有余额元(String accountBalance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^我选择固定金额取款方式取出\"([^\"]*)\"元$")
    public void 我选择固定金额取款方式取出元(String withdrawAmount) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^我应该收到现金\"([^\"]*)\"元$")
    public void 我应该收到现金元(String receiveAmount) throws Throwable {
        // Write code here that turns the phrase above into concrete actionss
        throw new PendingException();
    }

    @And("^我账户的余额应该是\"([^\"]*)\"元$")
    public void 我账户的余额应该是元(String remainingBlance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
