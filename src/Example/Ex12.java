package Example;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		List<WebElement> list=driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
		int size=list.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			
			String name=list.get(i).getText();
			System.out.println(name);
			Thread.sleep(2000);
			
			if(name.contains("Cucumber")) {
				
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
	

	}

}