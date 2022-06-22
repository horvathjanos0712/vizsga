import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    WebDriver driver;
    WebDriverWait wait;

    public Page(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private final String urlBasic = "http://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By popupX = By.xpath("//*[@id=\"at-cv-lightbox-close\"]");

    public void navigateToBasic() {
        driver.get(urlBasic);
    }
    public void clickX() {
        driver.findElement(popupX).click();
    }
}



