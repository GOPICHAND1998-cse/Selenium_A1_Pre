package ddtpackage;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteSingleCellInExistingSheet
{
    public static void main(String[] args) {

        try
        {
            FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/Premium_Sauce_Demo.xlsx");

            Workbook workbook = WorkbookFactory.create(fis);

            Sheet sheet = workbook.getSheet("UserInfo");

            Row row = sheet.getRow(0);

            Cell newCell = row.createCell(2);

            newCell.setCellValue("Email");

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
