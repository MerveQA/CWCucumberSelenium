package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    // neden private --> set methodu kullanılmasın , driverimiz degiştirilmesin diye
    //               --> getter i olsun setter i olmasın
    // neden static  --> Her yerde bu  objeyı kullanmak ıstıyoruz
    //               --> classa baglı olsun,objeye baglı olmasın
    //               --> cagırıldıgı her yere gidebilsin diye


    private Driver() {
        // private constructor Driver classınımızn 1 kere olusturulmasını saglar
        // Baska driver classı olmayacag ıcın baska bir driver objesı olusmayacak
    }

    public static WebDriver getDriver() {  // driver ın getter methodu

        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;

        }
    }


}
