import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SocialWidges {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://machstatz.com/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement facebook=driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/machstatz/')]//img[contains(@class,'icons')]"));
		boolean facebookimage=facebook.isEnabled();
		Assert.assertTrue(facebookimage, "facebook image is enabled");
		WebElement twitter=driver.findElement(By.xpath("//a[contains(@href,'https://twitter.com/machstatz?lang=en')]//img[contains(@class,'icons')]"));
		boolean twitterimage=twitter.isEnabled();
		Assert.assertTrue(twitterimage, "facebook image is enabled");
		WebElement linkedin=driver.findElement(By.xpath("//a[contains(@href,'https://www.linkedin.com/company/machstatz-business-solutions-pvt.-ltd./')]//img[contains(@class,'icons')]"));
		boolean linkedinimage=linkedin.isEnabled();
		Assert.assertTrue(linkedinimage, "iinkedin image is enabled");	
			
}
}
