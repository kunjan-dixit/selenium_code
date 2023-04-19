//package selenium_java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C://Users//avyuk//Downloads//chromedriver_win32//chromedriver.exe");
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(co);
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
searchBox.sendKeys("books");
driver.findElement(By.id("nav-search-submit-button")).click();

//linktext locator
driver.findElement(By.linkText("Easter Books")).click();
//partial link locator.
//driver.findElement(By.partialLinkText("")).click();
driver.close();
}

}
