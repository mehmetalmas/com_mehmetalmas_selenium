package selenium.tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class M05_DriverfindElemenMetodu_Locators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

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

        driver.get("https://www.amazon.de/");

        WebElement cookeiesAkzeptieren = driver.findElement(By.xpath("//input[@id=\"sp-cc-accept\"]"));
        cookeiesAkzeptieren.click();
        // driver.manage().deleteAllCookies();

        Thread.sleep(3000);


        List<WebElement> urunlerElementListesi = driver.findElements(By.className("a-spacing-micro"));

        System.out.println(urunlerElementListesi.size()); // WebElement lerin sayisini yazdirir, 20 tane varmis bu liste icinde

        // List leri direk yazdiramazsin bunlar icin for each kullanmalisin

        for (WebElement eachElement : urunlerElementListesi
             ) {
            System.out.println(eachElement.getSize()); // Web elementlerin boyutlarini yazdirir, (240, 24) gibi
            System.out.println(eachElement.getText()); // Web elementlerin üzerinde yazi varsa onlari  yazdirir, 20% Rabatt gibi
            System.out.println(eachElement.getTagName()); // Html tag isimlerini getirir, div gibi
            System.out.println(eachElement.getAttribute("class")); // girilen Html Attribute sini döndürür, 'a-section a-spacing-micro' gibi
            System.out.println(eachElement.getCssValue("color")); // renk, yazı tipi boyutu vb. gibi CSS özelliklerinin değerini elde etmek için kullanılır. rgba(0, 113, 133, 1) gibi

        }



        // driver.close();













    }

}
