package popuppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingBasicAuthFirstWay
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://admin:vinothqa@vinothqaacademy.com/basic-auth-demo/protected/");

      }
      catch (Exception e)
      {

          e.printStackTrace();
      }
    }
}
