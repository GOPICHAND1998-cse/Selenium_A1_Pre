package ddtpackage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CreatingNewSheet
{
    public static void main(String[] args)
    {
      try
      {
          FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/Premium_Sauce_Demo.xlsx");

          Workbook workbook = WorkbookFactory.create(fis);

          Sheet sheet = workbook.createSheet("NewUserSheet");

          Row newRow = sheet.createRow(0);

          newRow.createCell(0).setCellValue("NewData1");
          newRow.createCell(1).setCellValue("NewData2");

          FileOutputStream fos = new FileOutputStream("./src/test/resources/TestDataFolder/Premium_Sauce_Demo.xlsx");

          workbook.write(fos);

          workbook.close();

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
