package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	
	
	WebDriver driver;
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//PENDEJADA DEL WEY DE LOS VIDEOS
	/*
	public WebElements tag(String tag) {
		return driver.findElements(tag);
	} */
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	By searchBox = By.name("q");
	By googleLogo = By.xpath("//img[@alt='Google']");
	By suerteBoton = By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnI']");
	
}
