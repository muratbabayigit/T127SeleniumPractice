package Practice.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05_SeleniumTest {
        /* ...Exercise5...
    Navigate to  https://testpages.herokuapp.com/styled/index.html
    Click on  Calculater under Micro Apps
    Type any number in the first input
    Type any number in the second input
    Click on Calculate
    Get the result
    Print the result
      */
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://testpages.herokuapp.com/styled/index.html");
            Thread.sleep(1000);
            driver.findElement(By.id("calculatetest")).click();
            //driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
            driver.findElement(By.id("number1")).sendKeys("1258");
            driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("2536");
            driver.findElement(By.id("calculate")).click();
            System.out.println("İşlem Sonucu = " + driver.findElement(By.id("answer")).getText());
            /*
            WebElement answer=driver.findElement(By.id("answer"));
            System.out.println("İşlem Sonucu = " + answer.getText());
             */


           driver.quit();

        }

}
