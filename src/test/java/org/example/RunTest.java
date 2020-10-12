package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags="@Register",format ={"pretty","html:target/Destination","json:target/cucumber.json"})

public class RunTest {
}
