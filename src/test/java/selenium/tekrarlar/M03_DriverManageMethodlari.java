package selenium.tekrarlar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class M03_DriverManageMethodlari {
    public static void main(String[] args) {

        System.getProperty("webdriver.edge.driver" ,"src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.de/ref=nav_logo");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //Sürücünün ögeyi ararken beklemesi gereken süre //örtülü bekleme zaman aşımı değeri

       /*
        *Implicit wait : Selenium WebDriver'a, sayfada öğeyi bulamadığında istisna atmadan önce belirli bir
         süre beklemesini (süreler asagidaki gibi belirlenebilir) söyleriz.

        * driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        * driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        * driver.manage().timeouts().implicitlyWait(Duration.ofHours(24));
        * driver.manage().timeouts().implicitlyWait(Duration.ofDays(2));
        * driver.manage().timeouts().implicitlyWait(Duration.ofNanos(1));

        * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Deprecated

        */

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        // Bir hata vermeden önce sayfa yüklemesinin tamamlanması için beklenecek süre, sayfa yükleme zaman aşımının değeri
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
        //Eşzamansız bir komut dosyasının hata vermeden önce yürütmeyi bitirmesi için beklenecek süre, kod zaman aşımı değeri



        driver.manage().timeouts().getImplicitWaitTimeout();   // direk yazdirirsan PT5S bunu verir
        System.out.println(driver.manage().timeouts().getImplicitWaitTimeout().getSeconds()); // 5 yukarida biz atadik

        driver.manage().timeouts().getPageLoadTimeout();  //direk yazdirirsan PT5M bunu verir
        System.out.println(driver.manage().timeouts().getPageLoadTimeout().getSeconds());       // 15 varsayilan saniye degeri

        driver.manage().timeouts().getScriptTimeout();  //direk yazdirirsan PT30S bunu verir
        System.out.println(driver.manage().timeouts().getScriptTimeout().getSeconds());         // 15  varsayilan saniye degeri

        //---------------------------------------------------------------------------


        driver.manage().window().fullscreen(); // sayfayi tam ekran yapar
        driver.manage().window().maximize();  // ekrani tüm sayfaya kaplatir (ekran boyutlari her bilgisayarda farkli olabilir)
        driver.manage().window().minimize();  // sayfayi ekrandan asagiya indirir, minimize eder

        driver.manage().window().getPosition(); // ekranin o anki durdugu pozisyonunu(yeri) getirir (en-boy farkli olacak sekilde ayni pozisyonda sayfa olabilir)
        System.out.println( driver.manage().window().getPosition()); // (10, 10)

        driver.manage().window().getSize(); // ekranin o anki en boy bilgilerini getirir
        System.out.println(driver.manage().window().getSize());  // (945, 1020)

        driver.manage().window().setPosition(new Point(100,100)); // yeni bir pozisyon verdik
        driver.manage().window().setSize(new Dimension(1000,750));  // yeniden boyutlandirdik

        //---------------------------------------------------------------------------







    }
}
