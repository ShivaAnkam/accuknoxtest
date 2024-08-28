package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IntegrationTest {

    WebDriver driver;

    @BeforeClass
    public void openBrowser() throws Exception {
    	// Open the browser and and hit Front end URL
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.get("http://localhost:8080/"); 
    	Thread.sleep(5000);
    }
    @Test
    public void testFrontendDisplaysBackendData() {
        // Locate the element and extract the text of the element
        String frontendText = driver.findElement(By.xpath("//h1[text()='Hello from the Backend!']")).getText() ;
        
        // Define the expected text 
        String backendText = "Hello from the Backend!";

        // Assert that the actual text matches the expected text
        Assert.assertEquals(frontendText, backendText, "The frontend data matches with the backend data.");
    }

    @AfterClass
    public void closeBrowser() {
        // Close the browser
       driver.quit();
        
    }
}