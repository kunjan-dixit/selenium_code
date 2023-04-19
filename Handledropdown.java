import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Handledropdown {

    public static void main(String[] args)  {

    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	System.setProperty("webdriver.chrome.driver","C://Users//avyuk//Downloads//chromedriver_win32//chromedriver.exe");
    	WebDriver driver=new ChromeDriver(co);
    	driver.get("https://www.opencart.com/index.php?route=account/register");
    	webElement drpCountry=driver.findElement(By.id("input-country"));
    	
    	webElement drpCountryEle=new Select(drpCountryEle);
    	
    }

}