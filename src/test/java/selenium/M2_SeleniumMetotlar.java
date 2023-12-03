package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import static java.time.Duration.*;

public class M2_SeleniumMetotlar {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","src/resources/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.de/");
        Thread.sleep(5000);

        //-----------------------------------------------------------------------

        By ByAll = null;
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

        //-----------------------------------------------------------------------

        WebElement aramaKutusu = driver.findElement(new By.ById("nav-logo-sprites"));

        aramaKutusu.clear();  // parametre almaz
        aramaKutusu.click();  // parametre almaz

        aramaKutusu.getSize();  // Oluşturulan öğenin genişliği ve yüksekliği nedir?
        aramaKutusu.getSize().equals(5);
        aramaKutusu.getSize().getClass();  // Bu Nesnenin çalışma zamanı sınıfını döndürür.
        aramaKutusu.getSize().getWidth();  // Genisligi döndürür
        aramaKutusu.getSize().hashCode();
        aramaKutusu.getSize().notify();
        aramaKutusu.getSize().notifyAll();
        aramaKutusu.getSize().toString();
        aramaKutusu.getSize().wait();

        aramaKutusu.getTagName();
        aramaKutusu.getTagName().charAt('a');  // driver.getCurrentUrl() ile ayni metotlara ulasir

        aramaKutusu.isDisplayed();
        aramaKutusu.isEnabled();
        aramaKutusu.isSelected();
        aramaKutusu.sendKeys(" ");
        aramaKutusu.submit();

        aramaKutusu.getAttribute(" ");
        aramaKutusu.getAttribute(" ").charAt('a'); // driver.getCurrentUrl() ile ayni metotlara ulasir

        aramaKutusu.getCssValue("");
        aramaKutusu.getCssValue("").charAt('a'); // driver.getCurrentUrl() ile ayni metotlara ulasir

        aramaKutusu.getDomProperty("");
        aramaKutusu.getDomProperty("").charAt('a'); // driver.getCurrentUrl() ile ayni metotlara ulasir

        aramaKutusu.getLocation();
        aramaKutusu.getLocation().equals(null);
        aramaKutusu.getLocation().getX();
        aramaKutusu.getLocation().getY();
        aramaKutusu.getLocation().hashCode();
        aramaKutusu.getLocation().moveBy(5,6);

        aramaKutusu.getShadowRoot();

        aramaKutusu.getAccessibleName();
        aramaKutusu.getAccessibleName().charAt(5); // driver.getCurrentUrl() ile ayni metotlara ulasir

        aramaKutusu.getRect();
        aramaKutusu.getRect().equals("");   //aramaKutusu.getLocation(); ile ayni metotlara ulasir

        aramaKutusu.getText();   // driver.getCurrentUrl() ile ayni metotlara ulasir
        aramaKutusu.equals("");
        aramaKutusu.getClass();  // bir cok get metodu cagirabiliyor
        aramaKutusu.getScreenshotAs(null);
        aramaKutusu.hashCode();
        aramaKutusu.notify();
        aramaKutusu.notifyAll();
        aramaKutusu.toString();  // driver.getCurrentUrl() ile ayni metotlara ulasir
        aramaKutusu.wait();
        aramaKutusu.wait();
        aramaKutusu.wait();

        //-----------------------------------------------------------------------

        driver.close();
        driver.findElement(By.xpath(" "));
        driver.findElements(By.xpath(" "));
        driver.get("");
        driver.getCurrentUrl();
        driver.getPageSource();
        driver.getTitle();
        driver.getWindowHandle();
        driver.getWindowHandles();
        driver.getClass();
        driver.navigate();
        driver.quit();
        driver.switchTo();
        driver.equals("");
        driver.hashCode();
        driver.notify();
        driver.notifyAll();
        driver.toString();
        driver.wait();
        driver.wait();
        driver.wait();
        driver.manage();

        //-----------------------------------------------------------------------

        driver.findElement(By.xpath("")).getSize();
        driver.findElement(By.xpath("")).getSize().equals(null);
        driver.findElement(By.xpath("")).getSize().getHeight();
        driver.findElement(By.xpath("")).getSize().getWidth();
        driver.findElement(By.xpath("")).getSize().hashCode();
        driver.findElement(By.xpath("")).getSize().notify();
        driver.findElement(By.xpath("")).getSize().notifyAll();
        driver.findElement(By.xpath("")).getSize().toString();
        driver.findElement(By.xpath("")).getSize().wait(2000);

        //-----------------------------------------------------------------------

        driver.findElement(By.xpath("")).getTagName();
        driver.findElement(By.xpath("")).getTagName().charAt('a');
        driver.findElement(By.xpath("")).getTagName().chars();
        driver.findElement(By.xpath("")).getTagName().codePointAt(5);
        driver.findElement(By.xpath("")).getTagName().codePointBefore(3);
        driver.findElement(By.xpath("")).getTagName().codePointCount(3,2);
        driver.findElement(By.xpath("")).getTagName().codePoints();
        driver.findElement(By.xpath("")).getTagName().compareTo("");
        driver.findElement(By.xpath("")).getTagName().compareToIgnoreCase("");
        driver.findElement(By.xpath("")).getTagName().concat("");
        driver.findElement(By.xpath("")).getTagName().contains(null);
        driver.findElement(By.xpath("")).getTagName().contentEquals(null);
        driver.findElement(By.xpath("")).getTagName().endsWith("");
        driver.findElement(By.xpath("")).getTagName().equals(null);
        driver.findElement(By.xpath("")).getTagName().hashCode();
        driver.findElement(By.xpath("")).getTagName().indexOf(5);
        driver.findElement(By.xpath("")).getTagName().length();

        //-----------------------------------------------------------------------

        driver.findElement(By.xpath("")).isDisplayed();
        driver.findElement(By.xpath("")).isEnabled();
        driver.findElement(By.xpath("")).isSelected();
        driver.findElement(By.xpath("")).sendKeys("selenium");
        driver.findElement(By.xpath("")).submit(); //enter islevi yapar
        driver.findElement(By.xpath("")).getAttribute(" ");  // getTagName deki metotler bunda da acilir
        driver.findElement(By.xpath("")).getCssValue(""); // getTagName deki metotler bunda da acilir
        driver.findElement(By.xpath("")).getDomProperty(""); // getTagName deki metotler bunda da acilir
        driver.findElement(By.xpath("")).getLocation(); // bazi metotler acilir
        driver.findElement(By.xpath("")).getAriaRole(); // getTagName deki metotler bunda da acilir
        driver.findElement(By.xpath("")).getShadowRoot(); // bazi metotler acilir

        //-----------------------------------------------------------------------

        driver.get("https://www.amazon.de/");

        //-----------------------------------------------------------------------

        driver.getCurrentUrl().charAt('a');
        driver.getCurrentUrl().chars();
        driver.getCurrentUrl().codePointAt(5); // index aliyor
        driver.getCurrentUrl().codePointBefore(4);  // index aliyor
        driver.getCurrentUrl().codePointCount(4,6);
        driver.getCurrentUrl().codePoints();
        driver.getCurrentUrl().compareTo("");
        driver.getCurrentUrl().compareToIgnoreCase("");
        driver.getCurrentUrl().concat("");
        driver.getCurrentUrl().contains("");
        driver.getCurrentUrl().contentEquals("");
        driver.getCurrentUrl().endsWith("");
        driver.getCurrentUrl().equals("");
        driver.getCurrentUrl().equalsIgnoreCase("");
        driver.getCurrentUrl().getBytes();
        driver.getCurrentUrl().getClass();
        driver.getCurrentUrl().hashCode();
        driver.getCurrentUrl().indexOf(5);
        driver.getCurrentUrl().indexOf("");
        driver.getCurrentUrl().intern();
        driver.getCurrentUrl().isBlank();
        driver.getCurrentUrl().isEmpty();
        driver.getCurrentUrl().lastIndexOf(5);
        driver.getCurrentUrl().lastIndexOf("");
        driver.getCurrentUrl().length();
        driver.getCurrentUrl().lines();
        driver.getCurrentUrl().matches("");
        driver.getCurrentUrl().offsetByCodePoints(5,6);
        driver.getCurrentUrl().repeat(5);
        driver.getCurrentUrl().replace('a','b');
        driver.getCurrentUrl().replaceAll("ilk","ikinci");
        driver.getCurrentUrl().replaceFirst("ilk","ikinci");
        driver.getCurrentUrl().split("");
        driver.getCurrentUrl().startsWith("");
        driver.getCurrentUrl().strip();
        driver.getCurrentUrl().stripLeading();
        driver.getCurrentUrl().stripTrailing();
        driver.getCurrentUrl().subSequence(5,6); // index aliyor
        driver.getCurrentUrl().substring(5); // baslangic index aliyor
        driver.getCurrentUrl().toCharArray();
        driver.getCurrentUrl().toLowerCase();
        driver.getCurrentUrl().toString();
        driver.getCurrentUrl().toUpperCase();
        driver.getCurrentUrl().trim();
        driver.getCurrentUrl().wait();

        //-----------------------------------------------------------------------

        driver.getPageSource().charAt('a'); // driver.getCurrentUrl() ile ayni metotlara ulasir

        //-----------------------------------------------------------------------

        driver.getTitle().charAt('a');      // driver.getCurrentUrl() ile ayni metotlara ulasir

        //-----------------------------------------------------------------------

        driver.getWindowHandle().charAt('a'); // driver.getCurrentUrl() ile ayni metotlara ulasir

        //-----------------------------------------------------------------------

        driver.getWindowHandles().add(" "); // driver.getCurrentUrl() gibi benzer metotlara ulasir

        //-----------------------------------------------------------------------

        driver.getClass().getTypeName();  // bir cok get metodu cagirabiliyor

        //-----------------------------------------------------------------------

        driver.navigate().back();
        driver.navigate().equals(null);
        driver.navigate().forward();
        driver.navigate().getClass();
        driver.navigate().getClass().cast(null); // Bir cok get metodu cagirabiliyor
        driver.navigate().notify();
        driver.navigate().notifyAll();
        driver.navigate().refresh();
        driver.navigate().to("");
        driver.navigate().toString();
        driver.navigate().toString().charAt('a'); // driver.getCurrentUrl() ile ayni metotlara ulasir
        driver.navigate().wait();

        //-----------------------------------------------------------------------

        driver.quit();

        //-----------------------------------------------------------------------

        driver.switchTo();
        driver.switchTo().activeElement();
        driver.switchTo().alert();
        driver.switchTo().defaultContent();
        driver.switchTo().equals(null);
        driver.switchTo().frame(5);  // index
        driver.switchTo().frame(""); // name oder Id
        driver.switchTo().frame(" "); // name oder Id
        driver.switchTo().getClass();
        driver.switchTo().hashCode();
        driver.switchTo().newWindow(null);
        driver.switchTo().notify();
        driver.switchTo().notifyAll();
        driver.switchTo().parentFrame();
        driver.switchTo().toString();
        driver.switchTo().wait();
        driver.switchTo().window(""); // name oder Handle

        //-----------------------------------------------------------------------

        driver.equals("");

        //-----------------------------------------------------------------------

        driver.hashCode();

        //-----------------------------------------------------------------------

        driver.notify();

        //-----------------------------------------------------------------------

        driver.notifyAll();

        //-----------------------------------------------------------------------

        driver.toString().charAt('a');  // driver.getCurrentUrl() gibi benzer metotlara ulasir

        //-----------------------------------------------------------------------

        driver.wait();

        //-----------------------------------------------------------------------

        driver.wait();

        //-----------------------------------------------------------------------

        driver.wait();

        //-----------------------------------------------------------------------

        driver.manage();
        driver.manage().addCookie(null);
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookie(null);
        driver.manage().deleteCookieNamed("");
        driver.manage().equals("");
        driver.manage().getClass();
        driver.manage().getCookieNamed(""); // bazi get ve genelde ayni metotleri cagirir

        driver.manage().getCookies();
        driver.manage().getCookies().stream(); // stream üzerinden bir cok metot ve benzer metotlari cagiriyor

        driver.manage().hashCode();
        driver.manage().logs();
        driver.manage().notify();
        driver.manage().notifyAll();

        driver.manage().timeouts(); //genelde ayni metotlari cagiriyor
        driver.manage().timeouts().getImplicitWaitTimeout();
        //driver.manage().timeouts().getImplicitWaitTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().getImplicitWaitTimeout().getSeconds();
        driver.manage().timeouts().getImplicitWaitTimeout().minus(Duration.ofMillis(5000));
        driver.manage().timeouts().getImplicitWaitTimeout().plus(Duration.ofMinutes(10));
        driver.manage().timeouts().getImplicitWaitTimeout().compareTo(Duration.ofNanos(5000));
        driver.manage().timeouts().getImplicitWaitTimeout().dividedBy(Duration.ofDays(2));
        driver.manage().timeouts().getImplicitWaitTimeout().isNegative();
        driver.manage().timeouts().getImplicitWaitTimeout().toHours();
        driver.manage().timeouts().getImplicitWaitTimeout().withSeconds(5);

        driver.manage().timeouts().getPageLoadTimeout().minus(ofDays(5));
        driver.manage().timeouts().getScriptTimeout().plusHours(ZERO.toMinutesPart());
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
        driver.manage().timeouts().scriptTimeout(null);


        driver.manage().toString();
        driver.manage().wait();

        driver.manage().window();
        driver.manage().window().equals(driver.getWindowHandle());
        driver.manage().window().fullscreen();
        driver.manage().window().getClass();
        driver.manage().window().getPosition();
        driver.manage().window().getSize();
        driver.manage().window().hashCode();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().notify();
        driver.manage().window().notifyAll();
        driver.manage().window().setPosition(new Point(5,4));
        driver.manage().window().setSize(new Dimension(5,4));
        driver.manage().window().toString();
        driver.manage().window().wait();



        //-----------------------------------------------------------------------


































































    }
}
