import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdobeVersionSelenium {
    public static void main(String[] args) {
        // Make sure ChromeDriver is in your system PATH
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://get.adobe.com/reader/");

        try {
            Thread.sleep(5000); // wait for JS to load

            WebElement versionSpan = driver.findElement(By.cssSelector("span.mt-2"));
            System.out.println("Version Info: " + versionSpan.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
