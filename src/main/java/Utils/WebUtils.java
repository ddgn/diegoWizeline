package Utils;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebUtils extends Base {
    public FirefoxDriver driver;

    public WebUtils(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void tapElement (By by){
        driver.findElement(by).click();
    }
}
