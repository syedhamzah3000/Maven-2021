package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AI2 {

    public static void main(String[] args) throws InterruptedException {


        String[] items = new String[4];
        items[0] = "Moon";
        items[1] = "Stars";
        items[2] = "Blue";
        items[3] = "Stocks";

//set the property and path to your chromedriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
//define the chrome driver basically what driver I am going to use for automation
        WebDriver driver = new ChromeDriver();


        for(int i = 0; i < items.length; i++) {
            //navigate to google search page
            driver.navigate().to("https://www.bing.com");

            /*maximize the browser
            driver.manage().window().maximize();*/

            //put few seconds wait
            Thread.sleep(3000);

            //identify the search field and enter a keyword 'cars'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(items[i]);

            //hit submit on the search icon
            driver.findElement(By.xpath("//*[@class='sb_form_q']")).submit();

            //every time you interact with a new page you should put sleep statement
            Thread.sleep(2000);

            //capture the search result and only print out the number
            String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();

            //System.out.println("My full result is " + result);

            //extract out the number from the search result and print it using split
            String[] arrayResult = result.split(" ");
            System.out.println("The result of " + items[i] + " is " + arrayResult[1]);

        }//end of loop

        driver.quit();

    }



} //end of class
