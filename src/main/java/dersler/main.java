package dersler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
public class main {
    /*
    BİR TEST PROJESİ OLUŞTURURKEN YAPILACAKLAR
    1-) Step Definitionları tanımlama
    2-) Page sınıflarını oluşturma
    3-) Page sınıfında metodlar tanımlanıcak
    4-) Page sınıfında elementler tanımlanıcak
    5-) Page sınıfındaki metodların içine kullanacakları elementHelper metodları tanımlanıcak
    6-) Casei çalıştırıp hataları kontrol edip düzelticem
     */
    /*
    1- Scenario yu yazmak (Given-When-Then)
    2- Scenario daki steplerin metodlar ile bağlantısı için step definition dosyalarını oluşturmak.
    3- Step definition dosyalarının içini doldurmak
    4- Page sınıflarını oluşturdum
    5- Stepdefinitionlardaki nesne üretme adımlarını kendi pagelerine göre ayarladım.
    6- Step definition metodlarımın içindeki değişkenlerin isimlerini düzelttim
    7- Step definition cümlelerimin içinde page sınıfındaki metodları çağırdım ama bu metodlar daha page sınıfında
       yazılı değil.
    8- Page sınıfında, step definitionda oluşturduğum metod isimleriyle metodlar oluşturdum.
    9- Metodların içini gerekli elementHelper metodlarıyla doldurucam.
    10- Elementleri ekle
    11- Testini koş hataları düzelt. Noktalı virgül, featureda verdiğin dinamik texti yanlış yazmış olabilirsin,
        elementi yanlış almış olabilirsin.
     */
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("udid", "1cdbf51219027ece");
        desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
        desiredCapabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
        List<WebElement> elements = driver.findElements(By.id("android:id/text1"));
        for (WebElement elem : elements) {
            System.out.println(elem.getText());
        }
    }
}