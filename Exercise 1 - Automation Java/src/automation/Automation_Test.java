package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Automation_Test {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
				"/Users/hector.villa/eclipse-workspace/udemy_course/chromedriver");
		WebDriver driver = new ChromeDriver();

		
			// Go to apple.com.mx
			driver.get("https://www.apple.com/mx/");

			// Go to MAC
			WebElement MAC = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']"));
			MAC.click();

			// Wait 1 second
			Thread.sleep(1000);

			// Compare text
			WebElement actualText = driver.findElement(
					By.xpath("//section[@class='section section-macbook-air']//*[contains(text(),'Ligera')]"));
			String expectedText = "Ligera como siempre.\n" + "Poderosa como nunca.";
			Assert.assertEquals(actualText.getText(), expectedText);
			System.out.println("Ligera... text is correct");
			
			// Click on the Search bar
			WebElement searchIcon = driver.findElement(By.id("ac-gn-link-search"));
			searchIcon.click();
			
			// Search for iPhone XR
			WebElement textBox = driver.findElement(By.id("ac-gn-searchform-input"));
			textBox.sendKeys("iPhone XR");
			Thread.sleep(1000);
			
			// Select iPhone XR
			WebElement iPhoneXR = driver.findElement(By.xpath("//*[@id='ac-gn-searchresults']//*[contains(text(), 'XR')]"));
			iPhoneXR.click();
			Thread.sleep(1000);
			
			// Compare Page title
			String actualTitle = driver.getTitle();
			String expectedTitle = "iPhone XR - Apple (MX)";
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Page title text is correct");
			
			// Validate options are displayed and enabled
			boolean pantallaDisplayed = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Pantalla')]")).isDisplayed();
			boolean pantallaEnabled = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Pantalla')]")).isEnabled();
			Assert.assertTrue(pantallaDisplayed == true);
			Assert.assertTrue(pantallaEnabled == true);
			
			boolean faceIDDisplayed = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'ID')]")).isDisplayed();
			boolean faceIDEnabled = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'ID')]")).isEnabled();
			Assert.assertTrue(faceIDDisplayed == true);
			Assert.assertTrue(faceIDEnabled == true);
			
			boolean a12BionicDisplayed = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Bionic')]")).isDisplayed();
			boolean a12BionicEnabled = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Bionic')]")).isEnabled();
			Assert.assertTrue(a12BionicDisplayed == true);
			Assert.assertTrue(a12BionicEnabled == true);
			
			boolean camarasDisplayed = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Cámaras')]")).isDisplayed();
			boolean camarasEnabled = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Cámaras')]")).isEnabled();
			Assert.assertTrue(camarasDisplayed == true);
			Assert.assertTrue(camarasEnabled == true);
			
			boolean soloElIphoneDisplayed = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Sólo el iPhone')]")).isDisplayed();
			boolean soloElIphoneEnabled = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Sólo el iPhone')]")).isEnabled();
			Assert.assertTrue(soloElIphoneDisplayed == true);
			Assert.assertTrue(soloElIphoneEnabled == true);
			
			boolean especificacionesDisplayed = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Especificaciones')]")).isDisplayed();
			boolean especificacionesEnabled = driver.findElement(By.xpath("//li[@class='ac-ln-menu-item']//*[contains(text(), 'Especificaciones')]")).isEnabled();
			Assert.assertTrue(especificacionesDisplayed == true);
			Assert.assertTrue(especificacionesEnabled == true);
			
			
			boolean comprarDisplayed = driver.findElement(By.xpath("//a[@class='ac-ln-button']")).isDisplayed();
			boolean comprarEnabled = driver.findElement(By.xpath("//a[@class='ac-ln-button']")).isEnabled();
			Assert.assertTrue(comprarDisplayed == true);
			Assert.assertTrue(comprarEnabled == true);
			
			//Quit browser
			driver.quit();
	}

}
