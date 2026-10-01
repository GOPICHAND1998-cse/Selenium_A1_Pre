package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandlingChildWindowPopUp
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://demoqa.com/browser-windows");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String parentId = driver.getWindowHandle();

            driver.findElement(By.xpath("//button[@id='windowButton']"))
                    .click();

            Set<String> allPageIds = driver.getWindowHandles();

            for(String pageId : allPageIds)
            {
                if (pageId.equals(parentId))
                {
                    continue;
                }
                else{

                    driver.switchTo().window(pageId);
                    break;

                }
            }

            String newWindowText= driver.findElement(By.xpath("//h1")).getText();

            System.out.println(newWindowText);

            driver.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
