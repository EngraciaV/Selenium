package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauunchingBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        String current = driver.getCurrentUrl();
        System.out.println("the current url of the website is: "+current);

        String title = driver.getTitle();
        System.out.println("the title of the page is: "+title);

        driver.quit();
    }
}
