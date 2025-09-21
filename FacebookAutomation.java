package homeAssignment.Week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAutomation {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@href='/r.php?entry_point=login']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sam");

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tam");

		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));

		// day.click();

		Select dayDropDown = new Select(day);

		dayDropDown.selectByValue("8");

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));

		// month.click();

		Select monthDropDown = new Select(month);

		monthDropDown.selectByIndex(5);

		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));

		// year.click();

		Select yearDropDown = new Select(year);

		yearDropDown.selectByValue("2000");
		
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='2'] "));
		
		gender.click();
		
		WebElement mobileNumber = driver.findElement(By.xpath("//input[contains(@aria-label, 'Mobile number')]"));
		
		mobileNumber.sendKeys("samtam@gamil.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		
		password.sendKeys("sam123");
		
		WebElement userSubmit = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		
		userSubmit.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String currentTitle = driver.getTitle();
		
		System.out.println(currentTitle);
		
		
		

	}

}
