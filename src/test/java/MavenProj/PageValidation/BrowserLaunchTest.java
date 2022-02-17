package MavenProj.PageValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserLaunchTest 
{
	public WebDriver driver =null;
	
	@Test(priority = 1)
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Testing\\Chrome driver\\chromedriver_9.8\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
	}
	
  @Test(dependsOnMethods  ="browserLaunch" ,priority = 2)
  public void urlLaunch() 
  {
	  driver.get("https://demoqa.com/automation-practice-form/");
	  System.out.println("Title of Page="+driver.getTitle());
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test(priority = 3)
  public void registrationForm() throws InterruptedException 
  {
	  System.out.println("Students Registration form Validation:");
	  driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Sujata"); 
	  driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Asabe");
	  driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("sujata.asabe@gmail.com");
	  driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
	  Thread.sleep(3000);
	  //driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("8899556699");
	//  driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]")).click();
	  //driver.findElement(By.xpath("//div[@class=\"subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3\"]")).sendKeys("Testing");
	//WebElement sport=  driver.findElement(By.xpath("*//label[@for='hobbies-checkbox-1']"));
//	sport.click();
			
	//		driver.findElement(By.xpath("*//label[@for=\"hobbies-checkbox-3\"]")).click();
	//System.out.println("Checkbox is selected");
	  

	 
	  
	 // driver.findElement(By.xpath(""))
  }
  
  @Test(priority = 4)
  public void browserClose()
  {
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	//  driver.findElement(By.xpath("*//label[@for=\"hobbies-checkbox-3\"]")).click();


	  driver.findElement(By.xpath("*//label[text()=\"Sports\"]")).click();

	  //driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	//driver.close();
	  
  }
}
