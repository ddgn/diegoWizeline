
import Base.Base;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test extends Base {
    HomePage homePage;

    @BeforeTest
    public void initObjects(){
        Base.init("https://todoist.com/");
        homePage = new HomePage();
    }
    @org.testng.annotations.Test
    public void logInTest(){
        homePage.tapSignIn();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
