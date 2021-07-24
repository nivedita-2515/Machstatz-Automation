import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthDropdown{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKD\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://machstatz.zohorecruit.com/careers");
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//div[@id='589110000000300238']//a[@title='Add Educational Details']")).click();
		//driver.findElement(By.className("TF_84057924695254163_from_month")).click();
		Select dropdown=new Select (driver.findElement(By.className("TF_84057924695254163_from_month")));
		dropdown.selectByVisibleText("Jan");
		dropdown.selectByVisibleText("Feb");
		dropdown.selectByVisibleText("Mar");
		dropdown.selectByVisibleText("Apr");
		dropdown.selectByVisibleText("May");
		dropdown.selectByVisibleText("Jun");
		dropdown.selectByVisibleText("Jul");
		dropdown.selectByVisibleText("Aug");
		dropdown.selectByVisibleText("Sep");
		dropdown.selectByVisibleText("Oct");
		dropdown.selectByVisibleText("Nov");
		dropdown.selectByVisibleText("Dec");
		List<WebElement> optionlist=dropdown.getOptions();
		{
		System.out.println("The options are"+(optionlist.size()));
		System.out.println("options:==\n");
		}
		for(WebElement ele:optionlist) 
		{
			System.out.println(ele.getText());
		}
		int i=0;
		String readoptions="Oct";
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


