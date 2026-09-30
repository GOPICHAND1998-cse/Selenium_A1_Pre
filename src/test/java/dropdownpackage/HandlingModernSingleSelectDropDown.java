package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class HandlingModernSingleSelectDropDown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://qaplayground.com/practice/dropdowns");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


            Actions action = new Actions(driver);

//            action.scrollToElement(driver.findElement(By.xpath("//input[@id='citySearch']")))
//                    .perform();
//
//            driver.findElement(By.xpath("//button[@id='priorityDropdownTrigger']"))
//                    .click();
//
//            List<WebElement> allOptions  = driver.findElements(By.xpath("//div[@id='priorityDropdownList']/child::button/child::span[1]"));
//
//            Thread.sleep(2000);
//
//            for(WebElement option : allOptions)
//            {
//                if (option.getText().equals("High Priority"))
//                {
//                    option.click();
//
//                    break;
//                }
//            }

            action.scrollToElement(driver.findElement(By.xpath("//div[starts-with(@class,'footer-module')]/a[@aria-label='QA Playground home']")))
                    .perform();


            action.sendKeys(driver.findElement(By.xpath("//input[@id='citySearch']")),"H")
                    .perform();

           List<WebElement> allCitiNames = driver.findElements(By.xpath("//ul[@id='cityResults']/li/descendant::span[1]"));

           for(WebElement name : allCitiNames)
           {
               if (name.getText().equals("Hyderabad"))
               {
                   name.click();
                   break;
               }
           }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
