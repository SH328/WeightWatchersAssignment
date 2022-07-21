package SeleniumWebAutomation.weightwatchers.tests;

import SeleniumWebAutomation.weightwatchers.pages.WorkshopStudio;
import org.testng.annotations.Test;
import SeleniumWebAutomation.weightwatchers.pages.HomePage;
import SeleniumWebAutomation.weightwatchers.core.BaseTest;

public class CheckWatcherLocationAndBusinessHoursTest extends BaseTest {
    @Test
    public void Control() {
        HomePage homePage = new HomePage(getDriver());

        homePage.checkTitle();
        homePage.clickInPerson();
        homePage.enterZipCode();
        homePage.clickLocationSearch();
        String title = homePage.printTitleOfTheFirstResult();
        homePage.printDistanceOfTheFirstResult();
        homePage.clickFirstResult();

        WorkshopStudio basketOperations = new WorkshopStudio(getDriver());

        basketOperations.checkTitles(title);
        basketOperations.clickBusinessHours();
        basketOperations.printBusinessHours();
    }
}