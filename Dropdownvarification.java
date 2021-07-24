import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdownvarification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://machstatz.zohorecruit.com/careers");
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		//String[] exp= {"None","M.C.A.","B.SC","B.E.","M.S.","B.Tech"};
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='ZR_Leads_Highest Qualification Held']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("None");
		select.selectByVisibleText("M.C.A.");
		Thread.sleep(2000l);
		select.selectByVisibleText("B.SC.");
		Thread.sleep(2000l);
		select.selectByVisibleText("B.E.");
		Thread.sleep(2000l);
		select.selectByVisibleText("B.Tech");
		Thread.sleep(2000l);
		select.selectByVisibleText("M.S.");
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(2000l);
		select.selectByVisibleText("M.C.A.");
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(2000l);
		select.selectByVisibleText("B.Tech");
		System.out.println(select.getFirstSelectedOption().getText());
		Thread.sleep(2000l);
		select.selectByVisibleText("None");
		System.out.println(select.getFirstSelectedOption().getText());
		driver.close();
		
		
		
		
		//List<WebElement> options=select.getOptions();
		//for(WebElement we:options) {
		//	boolean match =false;
		//	
			//for(int i=0;i<exp.length;i++);{
			//	if (we.getText().equals(exp[i]));
			//	{
				//	match=true;
				}
			
			
		
			}
			
		
		
		

	

	

	
	


