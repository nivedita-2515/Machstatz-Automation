import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerificationofTitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://machstatz.com/");
		String expTitle="Home | Machstatz";
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle,expTitle);
		driver.get("https://machstatz.com/solutions/");
		String expTitle2="Solutions | Machstatz";
		String actTitle2=driver.getTitle();
		Assert.assertEquals(actTitle2, expTitle2);
		driver.get("https://machstatz.com/products/");
		String expTitle3="Products | Machstatz";
		String actTitle3=driver.getTitle();
		Assert.assertEquals(actTitle3, expTitle3);
		driver.get("https://machstatz.com/industries/");
		String expTitle4="Industries | Machstatz";
		String actTitle4=driver.getTitle();
		Assert.assertEquals(actTitle4, expTitle4);
		driver.get("https://machstatz.com/about-us/");
		String expTitle5="About | Machstatz";
		String actTitle5=driver.getTitle();
		Assert.assertEquals(actTitle5, expTitle5);
		driver.get("https://machstatz.com/resources/");
		String expTitle6="Resources | Machstatz";
		String actTitle6=driver.getTitle();
		Assert.assertEquals(actTitle6, expTitle6);
		
		
		
		
		
		driver.close();
		
	}
}
