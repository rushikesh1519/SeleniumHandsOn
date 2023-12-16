package Example;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example 1 starting and learning of git and github
		WebDriver driver=new ChromeDriver();
		String name="Rushikesh";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("Password");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String str=driver.findElement(By.cssSelector(".error")).getText();
		System.out.println(str);

	}

}
