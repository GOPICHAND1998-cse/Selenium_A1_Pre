package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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

          Actions action = new Actions(driver);

          action.pause(Duration.ofSeconds(2))
                  .scrollToElement(driver.findElement(By.xpath("//span[text()='S05']")))
                  .perform();

          Select selectMultiOption = new Select(driver.findElement(By.xpath("//select[@id='heroSelect']")));

          ArrayList<String> myHeros = new ArrayList(List.of("Aquaman","Batman","Ant-Man"));

          if (selectMultiOption.isMultiple())
          {
//              selectMultiOption.selectByVisibleText("Aquaman");
//              selectMultiOption.selectByVisibleText("Batman");
//              selectMultiOption.selectByVisibleText("Ant-Man");

              List<WebElement> allOptions = selectMultiOption.getOptions();

              for(WebElement option : allOptions)
              {
                  if (myHeros.contains(option.getText()))
                  {
                      option.click();
                  }
              }
              Thread.sleep(2000);

//              selectMultiOption.deselectByVisibleText("Ant-Man");

              selectMultiOption.deselectAll();


          }

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
