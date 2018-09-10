package net.lobster.step;

import cucumber.api.java.en.*;
import net.lobster.tools.Calculator;

import static org.junit.Assert.assertEquals;

/**
 * Created by lobster on 17-2-19.
 */
public class Add {

    Calculator calculator;


    @Given("^我 输入 \"([^\"]*)\" 和 \"([^\"]*)\"$")
    public void iInputAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator = new Calculator();
        calculator.setNum1(Integer.parseInt(arg0));
        calculator.setNum2(Integer.parseInt(arg1));

    }

    @When("^运行计算器的\"([^\"]*)\"法$")
    public void theCalculatorIsRun(String method) throws Throwable {

        switch (method) {
            case "加":
                calculator.add();
                break;
            case "减":
                calculator.sub();
                break;
            case "乘":
                calculator.mult();
                break;
            case "除":
                calculator.div();
                break;
            default:
                calculator.add();
                break;
        }
        // Write code here that turns the phrase above into concrete actions



    }

    @Then("^输出的结果应当 \"([^\"]*)\"$")
    public void theOutPutShouldBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Integer.parseInt(arg0), calculator.getNum3());
    }


}
