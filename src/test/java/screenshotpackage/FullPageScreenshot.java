package screenshotpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class FullPageScreenshot
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));

            driver.get("https://www.marvel.com/movies");

            TakesScreenshot screenshot = (TakesScreenshot) driver;

            File tempFile = screenshot.getScreenshotAs(OutputType.FILE);

            File destFile = new File("./ScreenshotFolder/FirstSS.png");

            FileHandler.copy(tempFile,destFile);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
