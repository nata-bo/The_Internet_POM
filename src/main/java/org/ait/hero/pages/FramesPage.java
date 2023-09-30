package org.ait.hero.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramesPage extends BasePage{

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Nested Frames']")
    WebElement nestedFrames;
    public FramesPage clickToNestedFrames() {
       click(nestedFrames);
        return new FramesPage(driver);
    }

    @FindBy(xpath = "//a[.='iFrame']")
    WebElement iFrame;
    public FramesPage clickToIframe() {
        click(iFrame);
        return this;
    }
    @FindBy(tagName = "iframe")
    List<WebElement> iframes;
    public FramesPage returnListOfFrames() {
        System.out.println("The total numbers of iframes: "+ iframes.size());
        return this;
    }
    @FindBy(id = "tinymce")
    WebElement iframe;

    public FramesPage switchToIframeByIndex(int index) {
        driver.switchTo().frame(index);
        System.out.println("Text of the iframe: "+ iframe.getText());
       return this;
    }

    @FindBy(xpath = "//frame[@name='frame-top']")
    WebElement frame1;
//   @FindBy(tagName = "body")
//   WebElement body;

    public FramesPage handleNestedFrames() {
        System.out.println("The total numbers of frames in the main page: "+ iframes.size());
        driver.switchTo().frame(frame1);
        System.out.println("The total numbers of frames in the parent iframe: " +iframes.size());
        driver.switchTo().frame(0);
        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println("Frame is " + body.getText());
        driver.switchTo().parentFrame();
        return this;
    }


}
