package selenium.tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class M05_DriverfindElemenMetodu {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
;
        String url = "https://www.zyyah.com/homeowner-lifestyle-perfected-home-value-protected/";
        driver.get(url);
        driver.findElement(By.id("//*[@class=\"link link--purple accept-cookies\"]")).click();
        System.out.println("completed");
















/*
        By ByAll = null;

        //web sitesindeki elementleri almak icin kullanilir.

        driver.findElement(new By.ById("frame")); // String id aliyor
        driver.findElement(new By.ByClassName("uniqeClassName")); //String className aliyor
        driver.findElement(new By.ByCssSelector("tagname[attributename='value']"));  // String cssSelector aliyor
        driver.findElement(new By.ByName("uniqeName"));  //String name aliyor
        driver.findElement(new By.ByLinkText("yazinin tamami")); // Strin olarak baglantı metnini aliyor
        driver.findElement(new By.ByPartialLinkText("yazinin bir kismi"));
        driver.findElement(new By.ByTagName("tagValue"));
        driver.findElement(new By.ByXPath("tagName[@attributeIsmi='attributeValue']"));

        driver.findElement(By.id("fname"));
        driver.findElement(By.className("uniqeClassName"));
        driver.findElement(By.cssSelector("tagname[attributename='value']"));
        driver.findElement(By.name("uniqeName"));
        driver.findElement(By.linkText("yazinin tamami"));
        driver.findElement(By.partialLinkText("yazinin bir kismi"));
        driver.findElement(By.tagName("tagValue"));
        driver.findElement(By.xpath("tagName[@attributeIsmi='attributeValue']"));

 */

    }

}
