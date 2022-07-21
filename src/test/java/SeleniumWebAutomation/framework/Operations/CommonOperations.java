package SeleniumWebAutomation.framework.Operations;

import java.util.List;
import org.openqa.selenium.*;
import SeleniumWebAutomation.framework.SetUp.CommonTest;

public class CommonOperations extends CommonTest {
    public String getTitle() {
        return getDriver().getTitle();
    }

    public void clickElement(WebElement webElement){ webElement.click(); }

    public void sendKeys(WebElement webElement, String string) { webElement.sendKeys(string); }

    public String getText(WebElement webElement) { return webElement.getText(); }

    public List<WebElement> findElements(By webElement){ return getDriver().findElements(webElement); }
}