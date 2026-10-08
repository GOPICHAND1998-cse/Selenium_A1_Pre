package utilitypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility
{
    Actions actions ;

    public ActionsUtility(WebDriver driver)
    {
        actions = new Actions(driver);
    }

    public void clickOnElement(WebElement element)
    {
        actions.click(element).perform();
    }

    public void writeInInputField(WebElement element,String data)
    {
        actions.sendKeys(element,data).perform();
    }

}
