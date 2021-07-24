import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VarificationofResource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://machstatz.com/about-us/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
WebElement dropdown=driver.findElement(By.xpath("//a[normalize-space()='Resource']"));
boolean dropdown1=dropdown.isDisplayed();
Assert.assertTrue(dropdown1, "cab be displayed");
WebElement ntdropdown=driver.findElement(By.xpath("//div[5]//div[1]//div[1]//div[1]"));
boolean dropdown2=ntdropdown.isDisplayed();
Assert.assertTrue(dropdown2, "It should not display on Resource Tab");
	}

}
