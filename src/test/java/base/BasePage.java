package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;




public class BasePage  {

    public static String productTitleStatic;
    public static String verificationCode;
    protected WebDriver driver = BaseTest.driver;
    private WebDriverWait wait = new WebDriverWait(driver, 15, 1000);
    protected  Actions action = new Actions(driver);
    private Logger LOGGER = Logger.getLogger(BasePage.class);

    protected WebElement getElement(ElementInfo elementInfo) {
        return driver.findElement(elementInfo.getBy());
    }

    protected WebElement waitForElement(ElementInfo info) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(info.getBy()));
    }

    protected void actionclick(ElementInfo info) {
        WebElement element = driver.findElement(info.getBy());
        action.moveToElement(element).click().build().perform();
    }


    protected void waitForElementAndClick(ElementInfo elementInfo) {
        waitForElement(elementInfo).click();
    }

    protected void waitForElementAndSendKeys(ElementInfo elementInfo, String text) {
        waitForElement(elementInfo).sendKeys(text);
    }

    protected String waitForElementAndGetText(ElementInfo elementInfo) {
        return waitForElement(elementInfo).getText();
    }
    protected String waitForElementAndGetTextSaveStatic(ElementInfo elementInfo) {
        verificationCode = waitForElement(elementInfo).getText();
        System.out.println(verificationCode);
        System.out.println(verificationCode);  System.out.println(verificationCode);
        System.out.println(verificationCode);

        return  verificationCode;
    }
    protected String waitForElementAndGetTextSaveStaticTitle(ElementInfo elementInfo) {
        productTitleStatic = waitForElement(elementInfo).getText();
        System.out.println(productTitleStatic);
        System.out.println(productTitleStatic);  System.out.println(verificationCode);
        System.out.println(productTitleStatic);

        return  productTitleStatic;
    }
    protected String waitForElementAndGetAttribute(ElementInfo elementInfo, String attribute) {
        return waitForElement(elementInfo).getAttribute(attribute);
    }

    protected List<WebElement> waitForElements(ElementInfo elementInfo) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(elementInfo.getBy()));
    }

    protected void waitForElementsAndClickWithIndex(ElementInfo elementInfo, int index) {
        waitForElements(elementInfo).get(index).click();

    }
    protected void acceptAlert (){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public boolean isElementVisible(ElementInfo info, int timeout){

        try{
            WebDriverWait wait = new WebDriverWait(driver,timeout);
            wait.until(ExpectedConditions.visibilityOfElementLocated(info.getBy()));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void deleteAllCookies(){

        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie cookie : allCookies) {
            driver.manage().deleteCookieNamed(cookie.getName());
        }}

    public void scrollToElementWithJs(ElementInfo info) {

        WebElement element = driver.findElement(info.getBy());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


    }


    public void javaScriptClicker(WebDriver driver, WebElement element) {

        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("var evt = document.createEvent('MouseEvents');"
                + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
                + "arguments[0].dispatchEvent(evt);", element);
    }
    public void clickAtJs(ElementInfo info) {

        WebElement element = driver.findElement(info.getBy());
        // isElementClickable(key,4);
        javaScriptClicker(driver, element);
    }
    protected void waitSeconds(int seconds) {
        try {
            LOGGER.info(seconds + " saniye kadar bekleniyor.");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            LOGGER.info(e);
        }}
    public String get_text_from_parent_by_postion(WebDriver driver, WebElement element, int textPosition) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("var parent = arguments[0];var textPosition = arguments[1]; var txtPosition = 0; var child = parent.firstChild; var textValue=''; while(child) { if (child.nodeType === 3){ if (txtPosition===(textPosition-1)){ textValue = child.textContent; break;}}else{txtPosition+=1;}child = child.nextSibling; } return textValue;", element, textPosition);
    }

    public void goHistoryPage1() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.history.go(-1)");
    }




}


