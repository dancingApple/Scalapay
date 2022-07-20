package util;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private final Map<String, Supplier<WebDriver>> driverMap = new HashMap<>();

    public DriverFactory() {
        // add all the drivers into a map
        driverMap.put("Chrome", chromeDriverSupplier);
        driverMap.put("Firefox", firefoxDriverSupplier);
        driverMap.put("RemoteChrome", remoteChromeDriverSupplier);
    }

    /**
     * Chrome driver supplier Please update the URL of the Chrome Driver for your
     * local execution
     */
    public final Supplier<WebDriver> chromeDriverSupplier = () -> {
        WebDriverManager.chromedriver().arch64().setup();
        return new ChromeDriver(chromeDriveOption());
    };

    /**
     * Chrome driver supplier in remote CI/CD tool Setup the automation run in
     * headless mode
     */
    public final Supplier<WebDriver> remoteChromeDriverSupplier = () -> {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = chromeDriveOption();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        options.addArguments("window-size=1920,1080");
        return new ChromeDriver(options);
    };

    /**
     * Firefox driver supplier Please update the URL of the FireFox (Geckodriver)
     * Driver for your local execution
     */
    public final Supplier<WebDriver> firefoxDriverSupplier = () -> {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    };

    /**
     * The method returns the desired type
     */
    // return a new driver from the map
    public final WebDriver getDriver(String desiredDriver) {
        return driverMap.get(desiredDriver).get();
    }

    public ChromeOptions chromeDriveOption() {
        Path currentRelativePath = Paths.get("");
        String downloadPath = currentRelativePath.toAbsolutePath().toString();

        ChromeOptions options = new ChromeOptions();
        HashMap<String,Object> prefs = new HashMap<>();
        prefs.put("plugins.always_open_pdf_externally",true);
        prefs.put("download.prompt_for_download", false);
//        prefs.put("plugins.plugins_disabled", new String[] {"Chrome PDF Viewer"});
        prefs.put("download.default_directory",downloadPath+"/src/test/resources/download");
        options.setExperimentalOption("prefs",prefs);
        return options;
    }
}