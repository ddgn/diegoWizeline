package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
   public static FirefoxDriver driver;
     public static void init(String mainUrl){
         driver = new FirefoxDriver();
         System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
         driver.get(mainUrl);
     }
}
