

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	WebDriver driver;
	By logout = By.linkText("Log Out");
	public Logout(WebDriver driver) {
		this.driver=driver;
	}
	public void ClickOnLogOut() {
		driver.findElement(logout).click();
		
	}
	
	
	
}
