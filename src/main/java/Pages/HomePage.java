package Pages;

import Base.Base;
import Utils.WebUtils;
import org.openqa.selenium.By;

public class HomePage extends Base {
    WebUtils webUtils;
    public By signInButton;

    public HomePage() {
        webUtils = new WebUtils(Base.driver);
        signInButton = By.xpath("//a[contains(text(),\"Log in\")]");
    }

    public void tapSignIn(){
        webUtils.tapElement(signInButton);

    }
}
