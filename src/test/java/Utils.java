import org.openqa.selenium.chrome.ChromeOptions;

public class Utils {
    public final static String BASE_URL = "http://localhost:8080/hello";
    public final static String CHROME_DRIVER_LOCATION = "src/test/drivers/chromedriver";

    public static ChromeOptions returnChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        //options.addArguments("--no-sandbox"); // Bypass OS security model
	options.addArguments("--headless");
        return options;
    }
}
