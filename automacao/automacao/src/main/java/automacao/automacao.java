package automacao;
import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class automacao {
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "src\\main\\java\\automacao\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();

        // Opening Google
        driver.get("http://www.google.com.br");

        // q its the search box name/ID
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Fiap");
        
        // Submit the form
        element.submit();

        // Printing the page title - just for example
        System.out.println("Page title is: " + driver.getTitle());
        

       
       // List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\"gsr\"]"));

       List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

        //Get the url of first link and navigate to it
        String fisrt_link = findElements.get(0).getAttribute("href");
        driver.navigate().to(fisrt_link);
       
        
        
      
//        WebDriverWait(driver, 20).until(EC.element_to_be_clickable((
//        
		// If you want to Close the browser, uncomment this line
		// driver.quit();
    }
}
