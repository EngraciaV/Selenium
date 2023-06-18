package class9;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) {

        String url= "http://amazon.com";
        String browser ="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement signIn= driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        Actions actions= new Actions(driver);
        actions.moveToElement(signIn);
    }
}
