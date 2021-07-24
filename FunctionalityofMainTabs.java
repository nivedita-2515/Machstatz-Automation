import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FunctionalityofMainTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
driver.get("https://machstatz.com/");
driver.navigate().to("https://machstatz.com/solutions/");
driver.navigate().to("https://machstatz.com/products/");
driver.navigate().to("https://machstatz.com/industries/");
driver.navigate().to("https://machstatz.com/resources/");
driver.navigate().to("https://machstatz.com/about-us/");
driver.navigate().to("https://machstatz.com/#lets-talk");
driver.close();

}



}