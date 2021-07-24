import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VarificationonRegisterPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://machstatz.zohorecruit.com/careers");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@name='First Name']")).sendKeys("Ramsin");
		driver.findElement(By.xpath("//input[@name='Last Name']")).sendKeys("Boss");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("abchgf@gmail.com");
		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@name='City']")).sendKeys("Sonpur");
		driver.findElement(By.xpath("//input[@name='State']")).sendKeys("UttarPradesh");
		//driver.findElement(By.xpath("//select[@id='ZR_Leads_Highest Qualification Held']")).sendKeys("MBA");
		driver.findElement(By.xpath("//textarea[@name='Skill Set']")).sendKeys("skill set");
		driver.findElement(By.xpath("//input[@name='Experience in Years']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name='Current Salary']")).sendKeys("500000");
		driver.findElement(By.xpath("//input[@name='Expected Salary']")).sendKeys("800000");
		driver.findElement(By.xpath("//textarea[@name='Additional Info']")).sendKeys("Done with all");
		//Educational details
		driver.findElement(By.xpath("//div[@id='589110000000300238']//a[@title='Add Educational Details']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Institute / School']")).sendKeys("school name");
		driver.findElement(By.xpath("//input[@aria-label='Major / Department']")).sendKeys("Department");
		driver.findElement(By.xpath("//input[@aria-label='Degree']")).sendKeys("Degree");
		//Duration and currently pursuing
		driver.findElement(By.xpath("//div[@id='589110000000300326']//a[@title='Add Experience Details']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Occupation / Title']")).sendKeys("Occupation");
		driver.findElement(By.xpath("//input[@aria-label='Company']")).sendKeys("Machstatz");
		driver.findElement(By.xpath("//textarea[@aria-label='Summary']")).sendKeys("The Ministry is primarily concerned of the companies");
		//Work duration and check box
		driver.findElement(By.xpath("//body/div[@id='zr-main-container']/div[@id='zr-panel-container']/div[@id='crmWebToEntityForm']/form[@name='WebToLeads589110000000072351']/div[1]/div[1]/div[1]"));
		driver.findElement(By.xpath("//a[normalize-space()='Browse']")).click();
		Thread.sleep(2000l);
		//driver.findElement(By.xpath("//input[@name='save']")).click();
		driver.close();
		
		

	}

}
