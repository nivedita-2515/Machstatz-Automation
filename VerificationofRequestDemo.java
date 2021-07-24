import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationofRequestDemo {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://machstatz.com/");
		driver.findElement(By.xpath("//button[@class='btn request-button']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://machstatz.com/solutions/");
		driver.findElement(By.xpath("//button[@class='request-button-sol']")).click();
		
	}
}
