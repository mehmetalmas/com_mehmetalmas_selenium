package selenium;

public class M00_SeleniumKurulumlari {

    /*
    Selenium Projesi Olusturma yollari

    1. yol
    Selenium u direk olarak sitesinden driverlarini indirerek hocanin ögrettigi gibi kurabiliriz
    1-Selenium/downloads a git
    2-Java driver i indir
    3-chrome browser i indir
    4-Maven Projesi olustur
    5-pom.xml i kapat
    6-src altina resources klasörü olustur
    7-selenium-java ve chrome browser u zip ten cikarip resources klasörün icine at
    8-main altinda test altina calismalarin icin bir klasör(paketi) olustur
    9-bu paket icinde bir class olustur
    10-resources klasörün icine attigin dosyalari güncelleyerek proje ekle
    File -> Project Structure -> Modules -> Dependencies -> + ->JARs or Directories
    acilan pencereden seleniumproje isme -> src -> main -> resources -> selenium-java git
    tüm jar dosyalarini sec ok de
    sonra lib altindaki jar dosyalarini da sec ok de
    Apply de sonra ok de
    10- olusturdugun clas icine System.setProperty("webdriver.choreme.driver"," ") yaz
    11-choreme.driver i koydugun resources klasöründeki choreme.driver path ini al
    choreme.driver.exe dosyasi üzerinde sag tikla
    CopyPath de
    Path From Content Root u sec (ücüncü)
    12-System.setProperty("webdriver.choreme.driver"," ") icine virgülden sonraki tirnaklar icine bu path i yapistir
    13-sinif icine WebDriver driver = new ChromeDriver(); yaz

    eger
    org.epenga.Selenium.WebDriver;  ve
    org.epenga.Selenium.chrome.ChromeDriver;
    import edildi ise
    proje olusturulmustur






    2.yol
    Maven Projesi olustrurarak bir selenium projesi olusturabiliriz,
    1-Maven Projesi olustur
    2-pom.xml acilacak
    3-<dependencies> </dependencies> tag i olustur
    4-<properties></properties> tagi icine (pom.xml de yukaridaki tag dir)
    5-<selenium.version></selenium.version> tagi olustur
    6-Mvnrepository git selenium-java dependency sini kopyala
    7-Mvnrepository git selenium-chrome-driver dependency sini kopyala (veya baska bir tarayicinin)
    8-<properties> tagi icindeki <selenium.version></selenium.version> tagi icerisine selenium-java nin son sürüm numarasini yaz
    <selenium.version>3.141.59</selenium.version> gibi
    9-selenium-java ve selenium-chrome-driver dependency leri icindeki <version></version> larinin icine ${selenium.version} yaz
    <version>${selenium.version}</version> gibi
    Bu sekilde <properties> tagi icindeki <selenium.version></selenium.version> tagi icerisindeki sürümü degistirip maven i
    proje icerisinde güncelemek ile hepsi otomatik güncelleri, hepsinin sürümünü tek tek yazip güncellemeye gerek kalmaz
    10- Selenium un sitesinden chrome browser i indir ve proje icerisinde bir klasörün icine at (klasör ismi resources olabilir driver da)
    bundan sonrasi class icindeki adimlar yukarisi ile aynidir














     */










}
