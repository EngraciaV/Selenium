package class5;

import Utlis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Alerts extends CommonMethods {
        public static void main(String[] args) throws InterruptedException {

            String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
            String browser = "chrome";
            openBrowserAndLaunchApplication(url, browser);

            WebElement alert1Bth = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
            alert1Bth.click();

            Alert confirmationAlert1 = driver.switchTo().alert();
            confirmationAlert1.accept();

            WebElement alert2Btn =driver.findElement(By.xpath("onclick='onclick='myAlertFunction()"));
            alert2Btn.click();
            Thread.sleep(3000);

            Alert confirmationAlert2= driver.switchTo().alert();
            confirmationAlert2.dismiss();




        }
    }

