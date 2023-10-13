import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginAutomation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Facebook login page
        driver.get("https://www.facebook.com");

        // Find the email/phone input field and enter your email/phone
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("YourEmailOrPhone");

        // Find the password input field and enter your password
        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("YourPassword");

        // Find and click the login button
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        // Wait for a while to see the result
        try {
            Thread.sleep(5000); // You can adjust the waiting time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
