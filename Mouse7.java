package contextClick;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouse7{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.fb.com/");
		driver.findElement(By.partialLinkText("English")).click();
WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		Actions act = new Actions(driver);
		act.contextClick(forgot).perform();
	//	act.sendKeys(Keys.ARROW_LEFT).perform();
		act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
	}
}
