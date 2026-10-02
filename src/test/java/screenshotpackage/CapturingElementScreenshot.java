package screenshotpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;

public class CapturingElementScreenshot
{
    public static void main(String[] args) {

            try
            {
                WebDriver driver = new ChromeDriver();

                driver.manage().window().maximize();

                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));

                driver.get("https://www.marvel.com/movies");

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));

                WebElement desiredMoviPoster = driver.findElement(By.xpath("//img[@alt='Marvel Logo']"));

                File tempElementFile = desiredMoviPoster.getScreenshotAs(OutputType.FILE);

                File destELementFile = new File("./ScreenshotFolder/demoSS2.png");

                FileHandler.copy(tempElementFile,destELementFile);
            }

            catch (Exception e)
            {
                e.printStackTrace();
            }

    }
}
