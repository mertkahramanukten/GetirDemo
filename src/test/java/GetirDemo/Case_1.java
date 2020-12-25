package GetirDemo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Case_1
{
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException{
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "11.0");
        capabilities.setCapability("deviceName","Nexus 5");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "com.getir.casestudy.dev");
        capabilities.setCapability("appActivity","com.getir.casestudy.modules.splash.ui.SplashActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.resetApp();

    }

    @Test
    public void testCal() throws Exception {

        Thread.sleep(1000);
        MobileElement Username = (MobileElement) driver.findElementById("com.getir.casestudy.dev:id/usernameEditText");
        Username.sendKeys("hello@getir.com");
        MobileElement Password = (MobileElement) driver.findElementById("com.getir.casestudy.dev:id/passwordEditText");
        Password.sendKeys("hello");
        MobileElement Submit = (MobileElement) driver.findElementById("com.getir.casestudy.dev:id/loginButton");
        Submit.click();
        Thread.sleep(500);
        MobileElement Sepet = (MobileElement) driver.findElementById("com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton");
        Sepet.click();
        Thread.sleep(500);
        String SepetBos = driver.findElementById("com.getir.casestudy.dev:id/tvTitle").getText();
        Assert.assertEquals(SepetBos, "There is no result");
        MobileElement Anasayfa = (MobileElement) driver.findElementById("com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView");
        Anasayfa.click();
        MobileElement Atiştirmalik = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.TextView");
        Atiştirmalik.click();
        Thread.sleep(500);
        MobileElement Urun1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView");
        Urun1.click();
        Thread.sleep(500);
        MobileElement Urun2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView");
        Urun2.click();
        Anasayfa.click();
        MobileElement Icecek = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.FrameLayout/android.widget.TextView");
        Icecek.click();
        Thread.sleep(500);
        TouchAction swipe = new TouchAction(driver)
                .press(PointOption.point(542,1255))
                .moveTo(PointOption.point(542,300))
                .release()
                .perform();
        Thread.sleep(500);
        MobileElement Urun3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView");
        Urun3.click();
        Sepet.click();
        MobileElement UrunSil = (MobileElement) driver.findElementById("com.getir.casestudy.dev:id/btnRemove");
        UrunSil.click();
        Thread.sleep(500);
        UrunSil.click();
        Thread.sleep(500);
        UrunSil.click();
        Thread.sleep(500);
        Assert.assertEquals(SepetBos, "There is no result");
        Thread.sleep(500);
    }

    @AfterClass
    public void teardown(){
        //close the app
        driver.quit();
    }
}
