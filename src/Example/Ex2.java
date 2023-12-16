package Example;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		String name="Rushikeshbhau";
		Ex2 m=new Ex2();
		String password=m.getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String s=driver.findElement(By.xpath("//p[@style*='color:']")).getText();
		System.out.println(s);
		

	}
	
	public String getPassword(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rushikesh");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abcd@mail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("83998498944");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		String str=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] s=str.split("'");
		String password=s[1].split("'")[0];
		return password;
		
	}

}
