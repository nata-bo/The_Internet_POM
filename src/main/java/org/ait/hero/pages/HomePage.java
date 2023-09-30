package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='JavaScript Alerts']")
    WebElement alertsLink;

    public AlertsPage getAlerts() {
         click(alertsLink);
        return  new AlertsPage(driver);
    }

    @FindBy(xpath = "//a[.='Multiple Windows']")
    WebElement windowsLink;
    public WindowPage getMultipleWindows() {
         click(windowsLink);
        return new WindowPage(driver);
    }

    @FindBy(xpath = "//a[.='Form Authentication']")
    WebElement formLink;
    public JSExecutor getFormAuthentication() {
         click(formLink);
        return new JSExecutor(driver);
    }

    @FindBy(xpath = "//a[.='Broken Images']")
    WebElement brokenImagesLink;
    public BrokenImagesPage getBrokenImages() {
        click(brokenImagesLink);
        return new BrokenImagesPage(driver);
    }

    @FindBy(xpath = "//a[.='Horizontal Slider']")
    WebElement sliderLink;
    public HorizontalSliderPage getHorizontalSlider() {
         click(sliderLink);
        return new HorizontalSliderPage(driver);
    }

    @FindBy(xpath = "//a[.='Frames']")
    WebElement framesLink;
    public FramesPage getFrames() {
        click(framesLink);
        return new FramesPage(driver);
    }
}
