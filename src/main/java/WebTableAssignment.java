import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableAssignment {
    public static void main(String[] args) {
        // Initialize a new instance of WebDriver as EdgeDriver
        WebDriver driver = new EdgeDriver();
        // Navigate to the specified URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // Find the number of rows in the table and print the result to the console
        System.out.println("Number of rows = " + driver.findElements(By.cssSelector(".table-display tbody tr")).size());
        // Find the number of columns in the table and print the result to the console
        System.out.println("Number of columns = " + driver.findElements(By.cssSelector(".table-display tbody tr th")).size());
        // Loop through each column in the third row of the table and print its text to the console
        for (int i = 1; i <= driver.findElements(By.cssSelector(".table-display tbody tr th")).size(); i++) {
            String path = ".table-display tbody tr:nth-child(3) td:nth-child(";
            System.out.println(driver.findElement(By.cssSelector(path + i + ")")).getText());

        }

    }
}
