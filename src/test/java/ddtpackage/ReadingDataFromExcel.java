package ddtpackage;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;

public class ReadingDataFromExcel
{
    public static void main(String[] args)
    {
      try
      {
          FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/Premium_Sauce_Demo.xlsx");

          Workbook workbook = WorkbookFactory.create(fis);

          Sheet sheet = workbook.getSheet("UserInfo");

          Row row = sheet.getRow(1);

          Cell cell = row.getCell(0);

          System.out.println(cell.toString());
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
