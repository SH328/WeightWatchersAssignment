package SeleniumWebAutomation.weightwatchers.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import SeleniumWebAutomation.utils.Constants;
import SeleniumWebAutomation.framework.SetUp.CommonTest;

public class BaseTest extends CommonTest {
    Constants constants = new Constants();

    @BeforeMethod
    public void start(){
        getDriver().get(constants.url);
    }

    @AfterMethod
    public void end() {
    }
}
