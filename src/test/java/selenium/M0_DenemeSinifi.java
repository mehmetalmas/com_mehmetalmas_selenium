package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class M0_DenemeSinifi {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(5000);


        driver.get("https://www.amazon.de/");

        List<WebElement> amazonDivListe = driver.findElements(By.className("a-carousel-col a-carousel-right celwidget"));
        System.out.println(amazonDivListe); //

        for (WebElement eachDegiskeni: amazonDivListe
        ) {
            System.out.println(eachDegiskeni.getSize());
        }

        driver.close(); // sadece acik olan pencereyi kapatir


    }
}
