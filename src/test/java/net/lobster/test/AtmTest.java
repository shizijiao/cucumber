package net.lobster.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by yangshutao on 2017/2/20.
 */
//"json:target/cucumber.json"
@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:fetures/atm.feature"}, glue = {"net.lobster.step"}, format ={ "pretty","html:target/html"
         } )

public class AtmTest {
}



