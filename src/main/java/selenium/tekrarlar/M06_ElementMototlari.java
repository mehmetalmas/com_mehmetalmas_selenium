package selenium.tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class M06_ElementMototlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        driver.get("https://www.amazon.de/");

        WebElement cookeiesAkzeptieren = driver.findElement(By.xpath("//input[@id=\"sp-cc-accept\"]"));
        cookeiesAkzeptieren.click();
        // driver.manage().deleteAllCookies();

        WebElement searchTextBox =  driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

        searchTextBox.sendKeys("city bike" + Keys.ENTER);
        // veya searchTextBox.submit();


        List<WebElement> ergebnisElement = driver.findElements(By.xpath("//span[contains(text() , '1-16 von 718 Ergebnissen')]"));







































    }
}
