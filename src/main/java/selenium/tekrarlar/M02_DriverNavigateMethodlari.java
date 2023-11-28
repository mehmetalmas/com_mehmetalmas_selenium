package selenium.tekrarlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class M02_DriverNavigateMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.navigate().to("https://www.amazon.de/ref=nav_logo");
        driver.navigate().to("https://www.youtube.com/");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();









    }
}
