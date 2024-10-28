package pkg;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenTestingforRegistrationorLogintestcasestestng {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void loadExcel(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCellData(int row, int col) {
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(sheet.getRow(row).getCell(col));
    }

    public static int getRowCount() {
        return sheet.getPhysicalNumberOfRows();
    }

    public static void setSheet(String sheetName) {
        sheet = workbook.getSheet(sheetName);
    }
}