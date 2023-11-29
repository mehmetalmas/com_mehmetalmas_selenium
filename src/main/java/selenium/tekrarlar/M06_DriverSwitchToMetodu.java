package selenium.tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class M06_DriverSwitchToMetodu {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        driver.get("https://www.amazon.de/");

        driver.findElement(By.id("//input[@id=\"twotabsearchtextbox\"]"));










    }
}
