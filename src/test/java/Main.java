import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\TEST\\Java\\Projects\\Test_run\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://broker2.rshb.ru/broker2/pwa/");
    }
}
