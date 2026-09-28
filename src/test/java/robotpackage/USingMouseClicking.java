package robotpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.time.Duration;

public class USingMouseClicking
{
    public static void main(String[] args) {

        try
        {
            Robot robot = new Robot();

            Thread.sleep(2000);

            robot.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON3_DOWN_MASK);

            Thread.sleep(2000);

            robot.mouseMove(10,0);

            Thread.sleep(2000);

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.worldometers.info/geography/flags-of-the-world/");

            Thread.sleep(2000);

            robot.mouseWheel(60);

            Thread.sleep(2000);

            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
