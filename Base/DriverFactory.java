package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    WebDriver driver;

    public WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")){
        driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("edge")) {
            driver= new EdgeDriver();
            
        }else{
            System.out.println("browser not supported");
        }
            
        return driver;
    }

    
} 
