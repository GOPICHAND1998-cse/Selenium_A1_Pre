package jspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingDisabledElements
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.letskodeit.com/practice");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.findElement(By.xpath("//input[@id='disabled-button']"))
                    .click();

            JavascriptExecutor executor = (JavascriptExecutor) driver;

            executor.executeScript("""
                                    let disabledElement = document.querySelector("input#enabled-example-input");
                                    disabledElement.removeAttribute("disabled");
                                    disabledElement.value="Demo Text";
                                    """);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
