package Example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

public class Ex7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), "6 Adult");
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), "6 Adult");

	}

}
