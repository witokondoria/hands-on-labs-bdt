package com.stratio.qa.hol.testsAT;
        import com.stratio.qa.cucumber.testng.CucumberRunner;
        import com.stratio.qa.hol.utils.BaseTest;
        import cucumber.api.CucumberOptions;
        import org.testng.annotations.Test;

@CucumberOptions(features = { "src/test/resources/features/sample.feature" })
public class ITsample extends BaseTest {

    public ITsample() {
    }

    @Test(enabled = true, groups = {"hol"})
    public void test() throws Exception {
        new CucumberRunner(this.getClass()).runCukes();
    }
}