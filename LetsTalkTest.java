import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LetsTalkTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://machstatz.com/");
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='COBJ1CF8']")).sendKeys("Mosh");
driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("nivedita.brahma@gmail.com");
driver.findElement(By.xpath("//input[@name='COBJ1CF9']")).sendKeys("987654321");
driver.findElement(By.xpath("//input[@name='NAME']")).sendKeys("wrtiy");
WebElement contactus=driver.findElement(By.xpath("//select[@name='COBJ1CF21']"));
Select dropdown=new Select(contactus);
dropdown.selectByVisibleText("Demonstration of what we do");
dropdown.selectByVisibleText("Business Opportunity/Partnership");
dropdown.selectByVisibleText("Job Seeker");
dropdown.selectByVisibleText("Others");
driver.findElement(By.xpath("//input[@name='COBJ1CF5']")).sendKeys("best option");
boolean option=dropdown.isMultiple();
Assert.assertFalse(option, "can choose multiple options");
driver.close();
//driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();;
	}







}


