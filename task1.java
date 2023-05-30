package homework4;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*HW1:
        goto: http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
        select, tuesday, thursday and friday one by one
        */
public class task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {


        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

       WebElement dayOfWeek= driver.findElement(By.xpath("//select[@id='select-demo']"));


      Select sel = new Select(dayOfWeek);

        List<String>daysOfTheWeek= Arrays.asList("Tuesday", "Thursday", "Friday");

        for(String days: daysOfTheWeek){
            sel.selectByVisibleText(days);
            Thread.sleep(2000);
        }
       driver.quit();}
    }

