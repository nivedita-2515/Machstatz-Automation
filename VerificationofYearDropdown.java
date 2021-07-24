import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerificationofYearDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://machstatz.zohorecruit.com/careers");
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//div[@id='589110000000300238']//a[@title='Add Educational Details']")).click();
		Select dropdown=new Select (driver.findElement(By.xpath("//select[@class='TF_84057924737107642_from_year']")));
		
		List<WebElement> optionlist=dropdown.getOptions();
		{
		System.out.println("The options are"+(optionlist.size()));
		}
			
		//for(WebElement ele:optionlist) 
		//{
			//System.out.println(ele.getText());
		//}
		int i=0;
		String readoptions="1960";
		for(WebElement read:optionlist) {
			String listoption=read.getText();{
				if(listoption.equalsIgnoreCase(readoptions)) {
					System.out.println("there is a option"+readoptions);
					i++;
					break;
				}
			}
		}
			
			}	
			
		}
			
	
		
		//for(WebElement ele:optionlist) {
			//System.out.println(ele.getText());
		
	


