package jspackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClickInOnDesiredElement
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://www.worldometers.info/images/flags/original/in.webp");

          JavascriptExecutor executor = (JavascriptExecutor) driver;

          executor.executeScript("let ourFlag = document.querySelector(\"img[src='/images/flags/w240/in.webp']\")\n" +
                  "ourFlag.click();");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
