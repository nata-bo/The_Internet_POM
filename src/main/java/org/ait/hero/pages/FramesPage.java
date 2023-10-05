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
    public FramesPage selectToNestedFrames() {
       click(nestedFrames);
        return new FramesPage(driver);
    }

    @FindBy(xpath = "//a[.='iFrame']")
    WebElement iFrame;
    public FramesPage selectToIframe() {
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

    @FindBy(tagName = "frame")
    List<WebElement> frame;


    public FramesPage handleNestedFrames() {
        System.out.println("The total numbers of frames in the main page: "+ frame.size());
        driver.switchTo().frame(frame1);
        System.out.println("The total numbers of frames in the top frame: " +frame.size());
        driver.switchTo().frame(0);
        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println("Frame is " + body.getText());
        driver.switchTo().defaultContent();
        return this;
    }

    public FramesPage getFrames() {
        System.out.println(frame.size());
        driver.switchTo().frame(0);
        System.out.println(frame.size());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        System.out.println(frame.size());
        return this;
    }



}
