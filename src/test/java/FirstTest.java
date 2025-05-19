import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    WebDriver driver = new ChromeDriver();



    @Test
    public void firstTest(){
        //System.out.println("it's second test");
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //=============================================
        pause(2);
        WebElement btnLetCarWork = driver.findElement(By.cssSelector("*[id='1']"));
        btnLetCarWork.click();
        pause(2);

        WebElement btnTermOfUse = driver.findElement(By.cssSelector("*[ng-reflect-router-link='terms-of-use'] "));
        btnTermOfUse.click();
        pause(2);

        WebElement btnSignUp = driver.findElement(By.cssSelector("a[href='/registration?url=%2Fterms-of-use']"));
        btnSignUp.click();
        System.out.println(btnSignUp.getText());
        pause(2);

        WebElement inputName;
        inputName = driver.findElement(By.id("name"));
        // WebElement inputName = driver.findElement(By.cssSelector("*"));
        inputName.sendKeys("Alex");
        pause(2);

        WebElement inputLastName = driver.findElement(By.cssSelector("*[ng-reflect-name='lastName']"));
        inputLastName.sendKeys("Neo");
        pause(2);

        WebElement inputEmail = driver.findElement(By.cssSelector("*[ng-reflect-name='email']"));
        inputEmail.sendKeys("peo@gmail.com");
        pause(2);

        WebElement inputPass = driver.findElement(By.cssSelector("*[ng-reflect-name='password']"));
        inputPass.sendKeys("*[Rtt678!f3");
        pause(2);

       // WebElement inputCheckBox = driver.findElement(By.cssSelector("*[type='checkbox']"));
       // inputCheckBox.click();
       // pause(2);



    }
    public static void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }




}
