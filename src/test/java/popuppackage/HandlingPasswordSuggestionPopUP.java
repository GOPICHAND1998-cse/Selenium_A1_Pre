package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingPasswordSuggestionPopUP
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://sauce-demo.myshopify.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.findElement(By.xpath("//a[text()='Sign up']"))
                    .click();

            driver.findElement(By.xpath("//input[@id='first_name']"))
                    .sendKeys("firstName");

            driver.findElement(By.xpath("//input[@id='last_name']"))
                    .sendKeys("lastName");

            driver.findElement(By.xpath("//input[@id='email']"))
                    .sendKeys("email@gmail.com");

            driver.findElement(By.xpath("//input[@id='password']"))
                    .click();

//            driver.findElement(By.xpath("//input[@value='Create']"))
//                    .click();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
