import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    private final By a = By.xpath("//*[@id=\"sum1\"]");
    private final By b = By.xpath("//*[@id=\"sum2\"]");
    private final By button = By.xpath("//*[@id=\"gettotal\"]/button");
    private final By result = By.xpath("//*[@id=\"displayvalue\"]");


    public void navigateToBasic() {
        driver.get(urlBasic);
    }
    public void clickX() {
        driver.findElement(popupX).click();
    }
    public void fillA() {
        driver.findElement(a).sendKeys("5");
    }
    public void fillB() {
        driver.findElement(b).sendKeys("5");
    }
    public void clickButton() {
        driver.findElement(button).click();
    }
    public String getResult() {
        return driver.findElement(result).getText();

    }



}



