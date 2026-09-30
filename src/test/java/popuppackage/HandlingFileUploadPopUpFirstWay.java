package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingFileUploadPopUpFirstWay
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://practice.expandtesting.com/upload");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='fileInput']"))
                  .sendKeys("C:\\Users\\User\\Desktop\\DummyUploadFile.txt");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
