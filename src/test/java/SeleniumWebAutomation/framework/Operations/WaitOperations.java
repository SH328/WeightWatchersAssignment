package SeleniumWebAutomation.framework.Operations;

import java.time.Duration;
import SeleniumWebAutomation.framework.SetUp.CommonTest;

public class WaitOperations extends CommonTest {
    public void implicitlyWait(int time) { getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(time)); }
}
