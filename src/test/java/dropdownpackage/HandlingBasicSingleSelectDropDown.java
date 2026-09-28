package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HandlingBasicSingleSelectDropDown
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Select select = new Select(driver.findElement(By.xpath("//div[@class='resp-tabs-container']//descendant::select")));

            Thread.sleep(2000);

            select.selectByVisibleText("India");

            Thread.sleep(2000);

            select.deselectByVisibleText("India");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
