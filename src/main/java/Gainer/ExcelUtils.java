package Gainer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;
// Import Cell
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	 static String sheetname = "kranthisheet";

    public static List<Map<String, String>> getTestdetailsfromExcel(String sheetname) throws IOException {
        List<Map<String, String>> list = new ArrayList<>();

        String excelPath = "C:\\Users\\kranthi.katta\\OneDrive\\Desktop\\kranthi.xlsx";
        FileInputStream fis = new FileInputStream(excelPath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetname);

        int rowNum = sheet.getLastRowNum();
        int colNum = sheet.getRow(0).getLastCellNum();

        for (int i = 1; i <= rowNum; i++) { // Start from 1 to skip header
            Map<String, String> map = new HashMap<>();
            
            for (int j = 0; j < colNum; j++) { // Loop through columns
                String key = sheet.getRow(0).getCell(j).getStringCellValue(); // Header
                Cell cell = sheet.getRow(i).getCell(j); // Current cell
                
                String value = ""; // Default value
                
                if (cell != null) { // Check if the cell is not null
                    switch (cell.getCellType()) {
                        case STRING:
                            value = cell.getStringCellValue(); // Get string value
                            break;
                        case NUMERIC:
                            value = String.valueOf(cell.getNumericCellValue()); // Convert number to string
                            break;
                        case BOOLEAN:
                            value = String.valueOf(cell.getBooleanCellValue()); // Convert boolean to string
                            break;
                        case FORMULA:
                            value = cell.getCellFormula(); // Get formula if applicable
                            break;
                        case BLANK:
                            value = ""; // Handle blank cells
                            break;
                        default:
                            value = ""; // Handle other cases (e.g., empty cells)
                    }
                }
                
                map.put(key, value); // Add key-value pair to map
            }
            list.add(map); // Add map to the list
        }

       // wb.close(); // Close Workbook
        fis.close(); // Close FileInputStream

        return list;
    }

    public static void main(String[] args) {
       

        List<Map<String, String>> data = null;
        try {
            data = getTestdetailsfromExcel(sheetname);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(data);
    }
}
