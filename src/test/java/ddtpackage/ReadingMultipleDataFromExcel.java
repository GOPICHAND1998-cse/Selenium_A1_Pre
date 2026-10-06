package ddtpackage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;

public class ReadingMultipleDataFromExcel
{
    public static void main(String[] args)
    {
      try
      {
          FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/Premium_Sauce_Demo.xlsx");

          Workbook workbook = WorkbookFactory.create(fis);

          Sheet sheet = workbook.getSheet("UserInfo");

          int lastRow = sheet.getLastRowNum();

          int lastCell= sheet.getRow(0).getLastCellNum();

          for(int r=1;r<=lastRow;r++)
          {
              Row newRow = sheet.getRow(r);
              for(int c=0;c<lastCell;c++)
              {
                    String data = newRow.getCell(c).toString();

                  System.out.print(data+"    ");
              }
              System.out.println();
          }

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
