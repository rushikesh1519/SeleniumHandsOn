package Example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubu
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		int chk = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("Total no of checkboxes is "+chk);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		boolean b1=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		boolean b2=driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected();
		boolean b3=driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isEnabled();
		boolean b4=driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isDisplayed();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		
		

	}

}
