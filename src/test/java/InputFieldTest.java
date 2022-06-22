import io.qameta.allure.Allure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class InputFieldTest extends BaseTest {

    @Test
    public void TestSumTwoNumbers() throws InterruptedException {
        Page page = new Page(driver, wait);
        page.navigateToBasic();
        page.clickX();
        page.fillA();
        page.fillB();
        page.clickButton();
        String actual = page.getResult();
        Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(2000);
        Assertions.assertEquals("10", actual);
        Thread.sleep(2000);
        
    }



}
