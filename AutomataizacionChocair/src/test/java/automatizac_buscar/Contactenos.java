package automatizac_buscar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactenos {
	private WebDriver driver;
	By locator_class = By.linkText("Contáctenos");
	By locator_enviar= By.xpath("//*[@id=\"wpcf7-f1566-p273-o1\"]/form/center/p[5]/input");

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
		Thread.sleep(5000);
		driver.findElement(By.name("nombre")).sendKeys("nicolay david tangarife sanabria alias pepito");
		driver.findElement(By.name("apellidos")).sendKeys("nicolay david");
		driver.findElement(By.name("empresa")).sendKeys("chocair");
		driver.findElement(By.name("telefono")).sendKeys("dfasdasd");
		Thread.sleep(5000);
		driver.findElement(locator_enviar).click();
		Thread.sleep(25000);
		}
	
	@After
	public void finalizar() {
		driver.quit();
	}
}
