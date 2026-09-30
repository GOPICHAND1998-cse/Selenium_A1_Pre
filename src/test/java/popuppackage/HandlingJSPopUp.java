package popuppackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingJSPopUp
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

         driver.get("https://vinothqaacademy.com/alert-and-popup/");

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

         wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//button[text()='Alert Box']"))));

         wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Alert Box']"))))
                 .click();

         Alert alert = driver.switchTo().alert();

         Thread.sleep(2000);

         alert.accept();

         Thread.sleep(2000);

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Confirm Alert Box']")))
                 .click();

         Thread.sleep(2000);

         alert.dismiss();

         Thread.sleep(2000);

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Prompt Alert Box']")))
                 .click();

         Thread.sleep(2000);

         alert.sendKeys("Yes");
         alert.accept();
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
