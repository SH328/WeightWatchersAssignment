package SeleniumWebAutomation.weightwatchers.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import SeleniumWebAutomation.utils.Constants;
import org.openqa.selenium.support.PageFactory;
import SeleniumWebAutomation.framework.Operations.AssertOperations;
import SeleniumWebAutomation.framework.Operations.CommonOperations;

public class WorkshopStudio {
	public WorkshopStudio(WebDriver driver) { PageFactory.initElements(driver, this); }

	Constants constants = new Constants();
	CommonOperations commonOperations = new CommonOperations();
	AssertOperations assertOperations = new AssertOperations();

	@FindBy( className = "locationName-1jro_")
	public WebElement locationName;

	@FindBy( className = "title-3o8Pv")
	public WebElement btnBusinessHours;

	String businessHoursDay = "dayName-CTNC6";
	String businessHoursList = "times-fms3v";

    public void checkTitles(String title) {
    	assertOperations.assertEquals(title, commonOperations.getText(locationName),
				constants.locationTitleErrorMessage);
    }

    public void clickBusinessHours() {
    	commonOperations.clickElement(btnBusinessHours);
    }

    public void printBusinessHours() {
		List<WebElement> businessDays = commonOperations.findElements(By.className(businessHoursDay));
		List<WebElement> businessHours = commonOperations.findElements(By.className(businessHoursList));

		for(int i = 0; i < businessDays.size(); i++) {
			System.out.print("Business Day : " + commonOperations.getText(businessDays.get(i)) + "	");
			System.out.println("Business Hours : " + commonOperations.getText(businessHours.get(i)));
		}
    }
}