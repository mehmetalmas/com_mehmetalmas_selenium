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

       /*
        * WebElement searchTextBox =  driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        * searchTextBox.sendKeys("city bike" + Keys.ENTER);
        * veya searchTextBox.submit();
        * List<WebElement> ergebnisElement = driver.findElements(By.xpath("//span[contains(text() , '1-16 von 718 Ergebnissen')]"));
        */



        WebElement mehrKaufenundSparen = driver.findElement(By.xpath("//a[@class=\"nav-a  \"][1]"));

        System.out.println("getText()  "  + mehrKaufenundSparen.getText());
        System.out.println("getTagName()  " + mehrKaufenundSparen.getTagName());
        System.out.println("getSize()  " + mehrKaufenundSparen.getSize());
        //System.out.println(mehrKaufenundSparen.getShadowRoot());
        System.out.println("getRect().getWidth()  "  + mehrKaufenundSparen.getRect().getWidth());
        System.out.println("getLocation()  " + mehrKaufenundSparen.getLocation());
        System.out.println("getDomProperty  "  +  mehrKaufenundSparen.getDomProperty("name"));
        System.out.println("getDomAttribute(\"name\")  " + mehrKaufenundSparen.getDomAttribute("name"));
        System.out.println("getAttribute(\"name\")  " + mehrKaufenundSparen.getAttribute("name"));
        System.out.println("getDomAttribute(\"color\")  " + mehrKaufenundSparen.getDomAttribute("color"));


        if (mehrKaufenundSparen.isEnabled()) {
            System.out.println("testPassed");
        }else{
            System.out.println("testFailed");
        }

        if (mehrKaufenundSparen.isSelected()) {
            System.out.println("testPassed");
        }else{
            System.out.println("testFailed");
        }

        if (mehrKaufenundSparen.isDisplayed()) {
            System.out.println("testPassed");
        }else{
            System.out.println("testFailed");
        }

        mehrKaufenundSparen.click();
        // mehrKaufenundSparen.clear(); Text girilen bir alan olmali
        // mehrKaufenundSparen.submit(); enter tusu gibi
        // mehrKaufenundSparen.sendKeys("hello"); text girilen bir alan olmali







































    }
}
