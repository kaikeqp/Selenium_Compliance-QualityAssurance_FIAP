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

        // Opening Bing
        driver.get("http://www.bing.com.br");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("plataforma esa");
        element.submit();

        System.out.println("Page title is: " + driver.getTitle());
        

		List<WebElement> findEsa = driver.findElements(By.linkText("Plataforma ESA: Gest?o do Conhecimento"));
		String first_link = findEsa.get(0).getAttribute("href");
		driver.navigate().to(first_link);
       
		List<WebElement> findPlanos = driver.findElements(By.linkText("Conhe?a nossos planos"));
		String second_link = findPlanos.get(0).getAttribute("href");
		driver.navigate().to(second_link);
        
		List<WebElement> findSobre = driver.findElements(By.linkText("Sobre"));
		String third_link = findSobre.get(0).getAttribute("href");
		driver.navigate().to(third_link);
		
		List<WebElement> findDezPadronize = driver.findElements(By.linkText("DEZPADRONIZE"));
		String fourth_link = findDezPadronize.get(0).getAttribute("href");
		driver.navigate().to(fourth_link);
        
		driver.quit();
    }
}
