import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class VarificationofAboutUsDropdown {
	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://machstatz.com/about-us/");
	//WebElement month=driver.findElement(By.xpath("//select[@aria-label='Work Duration From']"));
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("no. of links in this page"+links.size());
	
	driver.close();

	}
}
