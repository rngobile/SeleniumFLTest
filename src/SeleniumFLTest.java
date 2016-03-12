import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Richard on 3/12/2016.
 */
public class SeleniumFLTest {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Java\\jdk1.8.0_65\\lib\\selenium-2.52.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.footlocker.com");
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"header\"]/div[5]/div[1]/ul/li/div[1]/a/span"));
        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"header\"]/div[5]/div[1]/ul/li/div[2]/div[3]/div/div[1]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        action.click(subMenu).perform();
        Select dropDownMenu = new Select(driver.findElement(By.xpath("//*[@id=\"sortVal\"]")));
        dropDownMenu.selectByVisibleText("New Arrivals");

        //WebElement findMyShoes = driver.findElement(By.xpath("//*[@id=\"endeca_search_results\"]/ul/li[2]/span/a[2]/img"));
        WebElement findMyShoes = driver.findElement(By.xpath("//img[contains(lower-case(@src),'aq6895')]"));
        //System.out.println(driver.findElement(By.xpath("//img[contains(lower-case(@src), 'aq6895')]")).getSize());
       //action.click(findMyShoes).perform();
        /*
        WebElement dropMenu = driver.findElement(By.xpath("//*[@id=\"sortVal\"]"));
        WebElement menuNew = driver.findElement(By.xpath("//*[@id=\"sortVal\"]/option[4]"));
        action.click(dropMenu).perform();
        action.moveToElement(menuNew).perform();
        action.click(menuNew).perform();
        */
        //Thread.sleep(5000);
        //driver.close();
    }
}
