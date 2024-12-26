package Gainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableassertions {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/indices");

        driver.findElement(By.id("showMoreLess")).click();

        // Fetch the table body
        WebElement wt = driver.findElement(By.xpath("//table[@id = 'dataTable']//tbody"));

        // Get the table headers
        List<WebElement> rowheadinglist = driver.findElements(By.xpath("//*[@id='dataTable']/thead/tr/th"));

        // Create a list to store the table rows as maps
        List<Map<String, String>> tableData = new ArrayList<>();

        // Store header names
        List<String> headers = new ArrayList<>();
        rowheadinglist.forEach(rl -> headers.add(rl.getText()));

        // Fetch all rows in the table body
        List<WebElement> rows = wt.findElements(By.tagName("tr"));

        // Iterate through each row and store the data in a Map
        rows.forEach(row -> {
            Map<String, String> rowData = new HashMap<>();
            List<WebElement> columns = row.findElements(By.tagName("td"));
            
            // Fill the map with header as key and cell data as value
            for (int i = 0; i < columns.size(); i++) {
                rowData.put(headers.get(i), columns.get(i).getText());
            }

            // Add this row data to the list
            tableData.add(rowData);
        });

        // Now you can access the list of maps
        System.out.println("Table Data in List<Map<String, String>> format:");

        // Print the list which holds maps
        System.out.println(tableData);

        driver.quit();
    }
}
