import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {
    private OpenBrowser OpenBrowser = new OpenBrowser();
    private WebDriver driver = new ChromeDriver();

    @BeforeAll
    public void beforeAll(){
        driver = OpenBrowser.getChromeDriver();
    }

    @AfterAll
    public void afterAll(){
        driver.quit();
        driver.close();
    }

    @Test
    public void openBrowserAndTry(){
        String expectedTitle = "Google";
        driver.navigate().to("https://www.google.com/");
        assertEquals(expectedTitle, driver.getTitle());
    }
}
