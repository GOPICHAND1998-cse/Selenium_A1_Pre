package ddtpackage;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class RemovingExitingSheet
{
    public static void main(String[] args) {

        try
        {
            FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/Premium_Sauce_Demo.xlsx");

            Workbook workbook= WorkbookFactory.create(fis);

            Sheet sheet = workbook.getSheet("NewUserSheet");

            int sheetIndex = workbook.getSheetIndex(sheet);

            workbook.removeSheetAt(sheetIndex);

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
