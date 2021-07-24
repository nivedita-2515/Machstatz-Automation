import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://machstatz.com/products/");
List<WebElement> linkList=driver.findElements(By.tagName("a"));
linkList.addAll(driver.findElements(By.tagName("img")));
List<WebElement> activeLinks=new ArrayList<WebElement>();
for(int i=0;i<linkList.size();i++);{
	int i=0;
	if(linkList.get(i).getAttribute("href")!=null);{
		activeLinks.add(linkList.get(i));
	}
}
System.out.println("size of active links"+activeLinks.size());

	}

}
