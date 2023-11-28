package selenium.tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class M01_DriverMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "src/resources/edgedriver_win64/msedgedriver.exe" );
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.de/");

        Thread.sleep(3000);

        System.out.println("sayfanin urlsi : " + driver.getCurrentUrl()); // https://www.amazon.de/
        System.out.println("sayfanin basligi : " + driver.getTitle());  // Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr
        System.out.println("sayfanin Handle'i : "+ driver.getWindowHandle()); // B4974DECC00C8FCC53C916E8F26D2AAE
        System.out.println("sayfalarin Handle'leri : " + driver.getWindowHandles()); // [B4974DECC00C8FCC53C916E8F26D2AAE]
        System.out.println("sayfanin class 'i : " + driver.getClass()); // class org.openqa.selenium.edge.EdgeDriver
        System.out.println("sayfanin kodlari : " + driver.getPageSource());

        driver.close();











    }

}
