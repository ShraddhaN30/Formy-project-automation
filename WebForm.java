package Formy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\NewDrivers(2024)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		
		WebElement FirstName=driver.findElement(By.id("first-name"));
		FirstName.sendKeys("Raju");
		
		WebElement LastName= driver.findElement(By.id("last-name"));
		LastName.sendKeys("Rastogi");
		
		WebElement JobTitle= driver.findElement(By.id("job-title"));
		JobTitle.sendKeys("QA Engineer");
		
		WebElement Education= driver.findElement(By.id("radio-button-2"));
		Education.click();
		
		WebElement Gender= driver.findElement(By.id("checkbox-1"));
		Gender.click();
		
		WebElement Experience=driver.findElement(By.id("select-menu"));
		Experience.click();
		
		WebElement Dropdown= driver.findElement(By.cssSelector("option[value='2']"));
		Dropdown.click();
		
		
		WebElement DatePicker=driver.findElement(By.id("datepicker"));
		DatePicker.sendKeys("12/07/2024");
		DatePicker.sendKeys(Keys.RETURN);
		
		WebElement SubmitButton= driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
                SubmitButton.click();
 
        WebDriverWait wait= new WebDriverWait(driver,10);
        WebElement alert= wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
        String alertText=alert.getText();
        
        assertEquals("The Form was successfully submitted!",alertText);
        
		
		
		

	}

}
