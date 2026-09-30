package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class HandlingFileUploadPopUpSecondWay
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

          driver.get("https://practice.expandtesting.com/upload");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

          WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='fileInput']")))
//                          .click();

//          driver.findElement(By.xpath("//input[@id='fileInput']")).click();

          Actions action  = new Actions(driver);

          action.click(driver.findElement(By.xpath("//input[@id='fileInput']")))
                  .perform();

          StringSelection path = new StringSelection("C:\\Users\\User\\Desktop\\DummyUploadFile.txt");

          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);

          Robot robot = new Robot();

          Thread.sleep(4000);

          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);
          robot.delay(200);
          robot.keyRelease(KeyEvent.VK_V);
          robot.keyRelease(KeyEvent.VK_CONTROL);

          Thread.sleep(2000);

          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
