import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\download\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.by");
        driver.findElementByXPath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input").sendKeys("iTechArt");
        driver.findElementByXPath("//*[@id=\"hplogo\"]").click();
        driver.findElementByXPath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]").click();

        WebElement element = driver.findElementByClassName("LC20lb");
        String FirstLink = element.getText();
        if (FirstLink.contains("iTechArt")) {
            System.out.println("The first result contains the word iTechArt");
        }
        else {
            System.out.println("The first result does not contain the word iTechArt");
        }

        String Title = driver.getTitle();
        if (Title.contains("iTechArt")) {
            System.out.println("The title of the browser tab contains the word iTechArt");
        }
        else {
            System.out.println("The title of the browser tab does not contain the word iTechArt");
        }
    }
}