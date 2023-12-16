package Example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(("input[value='radio2']"))).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(("input[value='radio3']"))).click();
		Thread.sleep(1000);
		
		Select dropdown=new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByValue("option2");

	}

}
