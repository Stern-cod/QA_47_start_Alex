import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookIlcarroXPath {
    WebDriver driver = new ChromeDriver();

    @Test
    public  void  xpathTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement div = driver.findElement(By.xpath("//div[@id='root']"));
        System.out.println(div.getText());
        WebElement btnAbout = driver.findElement(By.xpath("//a[text()='ABOUT']"));
        String str = btnAbout.getAttribute("href");
        FirstTest.pause(2);

        WebElement btnLogin = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        btnLogin.click();

        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.sendKeys("rty@ghhjj.ghb");
        FirstTest.pause(2);

        WebElement inputPas = driver.findElement(By.xpath("//input[@name='password']"));
        inputPas.sendKeys("rwerw3543");
        WebElement btnReg = driver.findElement(By.xpath("//*[text()='Registration']"));
        btnReg.click();

        driver.close();
    }


    @Test
    public  void ilCarroXpath(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement btnSignUp = driver.findElement(By.xpath("//a[text()=' Sign up ']"));
        btnSignUp.click();
        FirstTest.pause(2);

        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        inputName.sendKeys("Alex");
        FirstTest.pause(2);

        WebElement inputLastName = driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
        inputLastName.sendKeys("Leo");
        FirstTest.pause(2);

        WebElement inputEmail = driver.findElement(By.xpath("//form/div[3]/input"));
        inputEmail.sendKeys("5t5t@hjk.gfv");
        FirstTest.pause(2);

        WebElement inputPas = driver.findElement(By.xpath("//form/div[4]/input"));
        inputPas.sendKeys("ghhuQy!526");
        FirstTest.pause(2);

        WebElement checkBox = driver.findElement(By.xpath("//label[@for='terms-of-use']"));
        // checkBox.click();
        FirstTest.pause(2);

        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));

        driver.close();




    }


    @Test
    public  void  LoginPhoneBookPositiveTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLoginHeder = driver.findElement(By.xpath("//a[text()='LOGIN']"));
        btnLoginHeder.click();

        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputPassword = driver.findElement(By.xpath("//*[@placeholder=\"Password\"]"));
        inputEmail.sendKeys("5t5t@hjk.gfv");
        inputPassword.sendKeys("ghhuQy!526");
        WebElement btnLoginForm = driver.findElement(By.xpath("//form/button[1]"));
        btnLoginForm.click();

    }

    @Test
    public void LoginIlCarroPositivTest(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLoginHeader = driver.findElement(By.xpath("//a[text()=' Log in ']\n" +
                " "));
        btnLoginHeader.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        // WebElement inputEmail_1 = driver.findElement(By.id("email"));
        WebElement inputPas = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
        inputPas.sendKeys("werwerwrwr");
        inputEmail.sendKeys("sfsfs@gmail.com");
        WebElement btnLoginForm = driver.findElement(By.xpath("//form/button"));
        btnLoginForm.click();
     driver.close();

    }

}
