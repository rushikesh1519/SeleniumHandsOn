package Example;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("In");
		Thread.sleep(3000);
		List<WebElement> list= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement l:list) {
			if(l.getText().equalsIgnoreCase("benin")){
				l.click();
				break;
			} 
		}
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		

	}

}
