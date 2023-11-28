package selenium.tekrarlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class M02_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.de/");


        String expectedUrl = "amazon";
        String expectedTitle = "Amazonn";


        String actualUrl = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();


        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Url Test Passed");
            System.out.println("actual Url " + actualUrl);
            System.out.println("actual url aranan " + expectedUrl + " kelimesini iceriyor");
        }else{
            System.out.println("Url Test Failed");
            System.out.println("actual Url " + actualUrl);
            System.out.println("actual url aranan " + expectedUrl + " kelimesini icermiyor");
        }

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Test Passed");
            System.out.println("actual title " + actualTitle);
            System.out.println("actual title aranan " + expectedTitle + " kelimesini iceriyor");
        }else{
            System.out.println("title Test Failed");
            System.out.println("actual title " + actualTitle);
            System.out.println("actual title aranan " + expectedTitle + " kelimesini icermiyor");
        }

        driver.close();




    }
}
