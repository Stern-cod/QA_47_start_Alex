import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookSel {

    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        FirstTest.pause(2);
        WebElement btnAbout = driver.findElement(By.cssSelector("*[href='/about']"));
        btnAbout.click();

        FirstTest.pause(2);
        WebElement textAbout = driver.findElement(By.cssSelector(".about_main__2Uv5W > h1"));
        System.out.println(textAbout.getText());

        FirstTest.pause(2);
        WebElement btnLogin = driver.findElement(By.cssSelector("*[href='/login']"));
        btnLogin.click();

        FirstTest.pause(2);
        WebElement inputEmail = driver.findElement(By.cssSelector("*[name='email']"));
        inputEmail.sendKeys("peo@gmail.com");

        FirstTest.pause(2);
        WebElement inputPass = driver.findElement(By.cssSelector("*[name='password']"));
        inputPass.sendKeys("Res4555jk");

        FirstTest.pause(2);
        WebElement btnRegistration = driver.findElement(By.cssSelector("*[name='registration']"));
        btnRegistration.click();


    }
}
