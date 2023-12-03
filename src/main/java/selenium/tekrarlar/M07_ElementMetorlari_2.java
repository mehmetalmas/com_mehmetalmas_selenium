package selenium.tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class M07_ElementMetorlari_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.de/");

        WebElement cookeiesAkzeptieren = driver.findElement(By.xpath("//input[@id=\"sp-cc-accept\"]"));
        cookeiesAkzeptieren.click();

        // Arama kutusuna Computer yazma ve aratma
        WebElement searchTextBox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        searchTextBox.sendKeys("Computer" + Keys.ENTER);

        // Bulunan sonuc sayisini yazdirma
        WebElement sonucSayisi = driver.findElement(By.xpath("//span[contains(*,  \"1-16 von mehr als 10.000 Ergebnissen oder\")]"));
        System.out.println(sonucSayisi.getText());

        // sonuc sayisinin 10 milyondan fazla oldugunu test edin
        String[] bulunanElemnetler = sonucSayisi.getText().split(" ");
        long sayi = Long.parseLong(bulunanElemnetler[1].replaceAll("\\.", ""));

        if (sayi>10000000){
            System.out.println("sayi 10 milyondan büyük");
        }else{
            System.out.println("sayi 10 milyondan kücük");
        }











    }
}
