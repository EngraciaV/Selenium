package class9;

import Utlis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClicks extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement rightClickbtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action =new Actions(driver);
        action.contextClick(rightClickbtn).perform();
        WebElement editOpt = driver.findElement(By.xpath("//span[text()='Edit']"));
        action.click(editOpt).perform();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        action.doubleClick(doubleClick).perform();
    }

}
