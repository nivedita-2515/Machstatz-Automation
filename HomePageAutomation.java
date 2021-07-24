import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePageAutomation {
	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","C://Users//AKD//Downloads//chromedriver_win32 (1)//chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://machstatz.com/");
   //Assert Right image in HomePage
	//WebElement section=driver.findElement(By.xpath("//div[@id='carouselExampleIndicators']//ol[@class='carousel-indicators']"));
	WebElement image1=driver.findElement(By.xpath("//img[@class='fold-img mt-md-4']"));
	boolean imagePresent1=image1.isDisplayed();
   Assert.assertFalse(imagePresent1, "image is displayed");
   //Assert LetsTalk image
   WebElement image2=driver.findElement(By.xpath("//img[@alt='Lets Talk']"));
   boolean imagePresent2=image2.isDisplayed();
   Assert.assertTrue(imagePresent2, "image is displayed");
   //Assert ijunction image
   WebElement image3=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/main[1]/div[3]/div[1]/div[1]/div[1]/img[1]"));
   boolean imagePresent3=image3.isDisplayed();
   Assert.assertTrue(imagePresent3, " image is displayed");
   //Assert rewSight image
   WebElement image4=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/img[1]"));
   boolean imagePresent4=image4.isDisplayed();
   Assert.assertTrue(imagePresent4, "image is displayed");
   //Assert ohm Technologies
   WebElement image5=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/main[1]/div[3]/div[1]/div[3]/div[1]/img[1]"));
   boolean imagePresent5=image5.isDisplayed();
   Assert.assertTrue(imagePresent5, "image is displayed");
   //Assert companyLogo
   WebElement image6=driver.findElement(By.xpath("//a[contains(@class,'navbar-brand')]//img[contains(@alt,'Logo')]"));
   boolean imagePresent6=image6.isDisplayed();
   Assert.assertTrue(imagePresent6, "caa see Logo");
   //display "Our Clients"
   String text="Our Clients";
   boolean text1=driver.getPageSource().contains("Our Clients");
   Assert.assertTrue(text1, "text is available");
   //Display "Channel Partners"
   String text2="Channel Partners";
   boolean text3=driver.getPageSource().contains("Channel Partners");
   Assert.assertTrue(text3, "text is present");
   driver.close();
   
		   
   
		   
   
   
	
	}
	
	
	
	
}
