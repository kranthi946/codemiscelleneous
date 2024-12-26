package Gainer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/indices");

        driver.findElement(By.id("showMoreLess")).click();

        // Fetch the table body
        WebElement wt = driver.findElement(By.xpath("//table[@id = 'dataTable']//tbody"));

        // Get the table headers and print them in the required format
        List<WebElement> rowheadinglist = wt.findElements(By.xpath("//*[@id='dataTable']/thead/tr/th"));

        // Print the table headers with the required format
        rowheadinglist.forEach(rl -> System.out.print(rl.getText() + " | "));
        System.out.println(); // Newline after the headers

        // Fetch all rows in the table body
        List<WebElement> rows = wt.findElements(By.tagName("tr"));

        // Print each row
        rows.forEach(row -> {
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Print each column's text followed by "|"
            columns.forEach(col -> System.out.print(col.getText() + " | "));
            System.out.println(); // Newline after each row
        });

        driver.quit(); // Close the browser at the end of execution
    }
}
