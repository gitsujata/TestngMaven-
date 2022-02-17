package MavenProj.PageValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalenderValidatioTest {
public WebDriver driver =null;
	
	@Test(priority = 1)
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Testing\\Chrome driver\\chromedriver_9.8\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
	}
	
  @Test(dependsOnMethods  ="browserLaunch" ,priority = 2)
  public void urlLaunch() throws InterruptedException 
  {
	  driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
	  System.out.println("Title of Page="+driver.getTitle());
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  driver.manage().getCookies();
  }
  
  @Test(priority = 3)
  public void onclickDateButton()
  {
	  //JavascriptExecutor js= (JavascriptExecutor)driver;
		 //js.executeScript("window.scrollBy(0,1000)");
	  WebElement selectdate=driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar k-button-icon']"));
	  selectdate.click();

  }
  @Test(priority = 4)
  public void onclickMoveDateButton() throws InterruptedException
  {
	//button to move next in calendar
    WebElement nextLink=driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-60-right']"));
    Thread.sleep(3000);
    ////button to click in center of calendar header
    WebElement midLink=driver.findElement(By.xpath("//a[normalize-space()='February 2022']"));
    Thread.sleep(3000);
    WebElement prevLink=driver.findElement(By.xpath("//span[contains(@class,'k-button-icon k-icon k-i-arrow-60-left')]"));
    Thread.sleep(3000); 
    
  }
}
