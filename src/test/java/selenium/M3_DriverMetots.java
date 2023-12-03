package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class M3_DriverMetots {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(5000);


        //--------------driver.get------------------------

        driver.get("https://www.amazon.de/");

        String amazonUrlsi = driver.getCurrentUrl();
        System.out.println("amazonun url ni getirir = " + driver.getCurrentUrl());
        System.out.println(amazonUrlsi);

        String amazonTitle = driver.getTitle();
        System.out.println("amazonun basligini getirir = " + driver.getTitle());
        System.out.println(amazonTitle);

        String acilanBrowserHandleDegeri = driver.getWindowHandle();
        driver.switchTo().window(acilanBrowserHandleDegeri);
        System.out.println("acilanBrowserHandleDegerini getirir = " + driver.getWindowHandle()); //EB49C0086026543DE21D057FE8ADD544


        Set<String> acilanBrowserHandleDegerleri = driver.getWindowHandles();
        for (String handle: acilanBrowserHandleDegerleri){
            if(!handle.equals(acilanBrowserHandleDegeri)){
                driver.switchTo().window(handle);
            }
        }
        System.out.println("acilanBrowserHandleDegerlerini getirir = " + driver.getWindowHandles()); //[EB49C0086026543DE21D057FE8ADD544]


        String acilanSayfaninTumKaynakKodlari = driver.getPageSource();
        System.out.println("acilanSayfaninTümKaynakKodlarini getirir = " + driver.getPageSource());


        //--------------driver.navigate()------------------------

        driver.navigate().to("https://www.amazon.de/");
        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        //--------------driver.manage().window()------------------------

        driver.get("https://www.amazon.de/");

        driver.manage().window().fullscreen();
        //driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1100,900));
        driver.manage().window().setPosition(new Point(200,200));


        //---------------classNameLocators----------------------

        driver.get("https://www.amazon.de/");
        List<WebElement> aramaSonucuListesi = driver.findElements(By.className("a-carousel-col a-carousel-right celwidget"));
        //className bosluk(space) iceriyor ise, yol yanlis ise Excepsion vermez bos liste döndürür
        System.out.println(aramaSonucuListesi);
        System.out.println(aramaSonucuListesi.get(0).getText());
        System.out.println(aramaSonucuListesi.size());

        for (WebElement eachDegiskeni: aramaSonucuListesi
        ) {
            System.out.println(eachDegiskeni.getSize());
        }

        //---------------linkTextLocators-----------------------

        WebElement gulumsetenKampanya = driver.findElement(By.linkText("data-csa-c-type"));
        gulumsetenKampanya.click();

        //---------------idLocators-----------------------

        WebElement hediyeKartlari = driver.findElement(By.id("x6g6zv-4c81rl-ibtnqu-hdyiud"));
        hediyeKartlari.submit();
















    }
}
