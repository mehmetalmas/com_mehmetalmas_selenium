package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Set;

public class M1_Kurulum {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(5000);
















        driver.close(); // sadece acik olan pencereyi kapatir






    }
}
