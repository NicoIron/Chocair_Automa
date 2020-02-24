package automatizac_buscar;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Buscar {
	private WebDriver driver;
	By locator_class = By.className("search-icon");
	By locator_buscar= By.className("search-field");
	@Before
	public  void Ejecutar()
	{

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/DriverChrome/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//String url = "https://www.google.es/";
		driver.get("https://www.choucairtesting.com/");
	}
	
	@Test
	public void buscarOp() throws InterruptedException {
		driver.findElement(locator_class).click();
		driver.findElement(locator_buscar).sendKeys("desarrollo");
		Thread.sleep(5000);
		driver.findElement(locator_buscar).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		}
	
	@After
	public void finalizar() {
		driver.quit();
	}
	
	
}