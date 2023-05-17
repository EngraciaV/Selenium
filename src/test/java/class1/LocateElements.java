package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();//maximize the window
        driver .findElement(By.id("email")).sendKeys("snow");//send some text in the email
        driver .findElement(By.id("pass")).sendKeys("belle");//send some text to the password field

        String url= driver.getCurrentUrl();
        System.out.println(url);

        String title =driver.getTitle();
        System.out.println(title);

        driver.close();

    }
}
