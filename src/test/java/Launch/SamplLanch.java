package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;

public class SamplLanch extends BaseClass {
	
	public static void main(String[] args) {
		
		launchChrome();
		loadUrl("https://www.facebook.com");
		winMax();
		
		WebElement txt = driver.findElement(By.id("email"));
		fill(txt, "gress");
		
		WebElement pass = driver.findElement(By.id("pass"));
		fill(pass,"2143325");
		
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		btnClk(btn);
		
	}
	
	
	

}
