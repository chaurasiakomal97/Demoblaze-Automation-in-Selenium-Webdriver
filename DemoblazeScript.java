import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeScript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay Chaurasia\\Desktop\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.demoblaze.com/");
		/*
		 * w.findElement(By.xpath("//a[@id='signin2']")).click();
		 * w.findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("Komal@1234");
		 * w.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(
		 * "Khushi@1234");
		 * w.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		 * Thread.sleep(2000); Alert a=w.switchTo().alert(); Thread.sleep(2000);
		 * a.accept();
		 */
        w.findElement(By.xpath("//a[@id='login2']")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Komal@1234");
        w.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("Khushi@1234");
        w.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor) w;
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(6000);
		js.executeScript("window.scrollTo(0,-2000)");
		w.findElement(By.xpath("//a[contains(text(),'HTC One M9')]")).click();
		Thread.sleep(2000);
		w.findElement(By.partialLinkText("Add to ca")).click();
		Thread.sleep(2000);
		
		Alert a=w.switchTo().alert();
        Thread.sleep(2000);
        a.accept();
        w.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
     
        w.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
        w.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
        
        w.findElement(By.xpath("//body/nav[@id='narvbarx']/div[@id='navbarExample']/ul[1]/li[1]/a[1]")).click();
        w.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys("Komal@gmail.com");
        w.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("5586597546");
        w.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("Hello world");
        w.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
        
        Thread.sleep(2000);
        
        Alert a1=w.switchTo().alert();
        Thread.sleep(2000);
        a1.accept();
        
        Thread.sleep(2000);
        
        w.findElement(By.xpath("//a[contains(text(),'About us')]")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("//body/div[@id='videoModal']/div[1]/div[1]/div[3]/button[1]")).click();
        
        w.findElement(By.xpath("//a[@id='cartur']")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("Komal");
        w.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
        w.findElement(By.xpath("//input[@id='city']")).sendKeys("Thane");
        w.findElement(By.xpath("//input[@id='card']")).sendKeys("ECPV2467854");
        w.findElement(By.xpath("//input[@id='month']")).sendKeys("January");
        w.findElement(By.xpath("//input[@id='year']")).sendKeys("2021");
        w.findElement(By.xpath("//input[@id='name']")).click();
        w.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
        w.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        w.navigate().back();
		Thread.sleep(2000); 
		w.findElement(By.xpath("//a[@id='logout2']")).click();
		 
        
        
	}
}
