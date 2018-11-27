

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
	
	By myacc =By.xpath("//a[text()=\"My Account\"]");
	
	WebDriver driver;

	public Main(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickOnMyAcc() {
		driver.findElement(myacc).click();
	}	
		
}

