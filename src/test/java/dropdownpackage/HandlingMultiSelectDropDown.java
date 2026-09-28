package dropdownpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingMultiSelectDropDown
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://qaplayground.com/practice/dropdowns");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
