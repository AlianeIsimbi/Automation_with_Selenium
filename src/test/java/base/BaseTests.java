package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass

    public void setUp(){
        System.setProperty("Webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        homePage = new HomePage(driver);


//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());

//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();

//        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
//        shiftingContentLink.click();
//
//        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
//        menuElement.click();
//
//        List<WebElement> navigationLinks = driver.findElements(By.tagName("li"));
//        System.out.println(navigationLinks.size());
//
//
//        //driver.manage().window().setSize(new Dimension(375, 812));
//
//        System.out.println(driver.getTitle());
        //driver.quit();
    }

        @AfterClass
        public void tearDown(){
            driver.quit();
        }

}
