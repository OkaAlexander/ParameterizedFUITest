package BaseClass;

import PageObject.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
    protected static LandingPage landingPage;
    public static WebDriver driver;


    @BeforeEach
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get("https://todomvc.com/");
        driver.manage().window().maximize();
        landingPage=new LandingPage(driver);
    }
    @AfterEach
    public  void tearDown(){
        if(driver!=null){
            driver.quit();
        };
    }
}
