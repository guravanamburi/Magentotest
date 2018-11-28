
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Logout;
import com.abc.magentoobjects.Main;

public class Magentotest {

	@Test
	public void test()throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "http://www.magento.com";
		driver.get(url);

		Main m = new Main(driver);
		m.ClickOnMyAcc();
		Thread.sleep(3000);

		Login l = new Login(driver);
		l.TypeEmail("sucheendra.abc@gmail.com");
		l.typepassword("Welcome123");
		l.ClickOnLogin();
		Thread.sleep(3000);

		Logout out = new Logout(driver);
		out.ClickOnLogOut();
		Thread.sleep(3000);
		driver.quit();
	}

}
