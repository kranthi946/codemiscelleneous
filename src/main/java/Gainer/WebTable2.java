package Gainer;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {
    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Open the website
        driver.get("https://money.rediff.com/indices");
        
        // Click on the 'Show More/Less' button to reveal all rows
        driver.findElement(By.id("showMoreLess")).click();
        
        // Get the table body
        WebElement wt = driver.findElement(By.xpath("//table[@id='dataTable']//tbody"));
        
        // Get all rows
        List<WebElement> rows = wt.findElements(By.tagName("tr"));
        System.out.println("Number of rows: " + rows.size());
        
        // Using Java 8 stream to iterate over rows
        rows.forEach(row -> {
            // Get all the columns in each row
            List<WebElement> columns = row.findElements(By.tagName("td"));
            // Print the text of each column
            columns.forEach(col -> System.out.print(col.getText() + " | "));
            System.out.println(); // Newline after each row
        });
        
        // Close the browser
        driver.quit();
    }
}
