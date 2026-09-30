package framepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingSingleFrame
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://anniebesant.org/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

            action.scrollToElement(driver.findElement(By.xpath("//p[contains(text(),'2007 - 2026 All Rights Reserved')]")))
                    .perform();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@src,'https://www.google.com/maps/embed?pb=!')]")));

            driver.findElement(By.xpath("//button[@aria-label='Show street map']"))
                    .click();

            driver.switchTo().defaultContent();

            action.moveToElement(driver.findElement(By.xpath("//a[text()='About us']")))
                    .perform();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
