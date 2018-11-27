

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	By email=By.id("email");
	 By password =By.id("pass");
	By login=By.id("send2");
	
	static WebDriver driver;
	public Login(WebDriver driver) {
		Login.driver=driver;
	}
	public void TypeEmail(String data) {
		driver.findElement(email).sendKeys(data);
	}
	public  void typepassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void ClickOnLogin()
	{
		driver.findElement(login).click();
	}

}
