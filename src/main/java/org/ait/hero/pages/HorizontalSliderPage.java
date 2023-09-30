package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage{
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "input")
    WebElement sliderContainer;

    public HorizontalSliderPage moveSliderInHorizontalDirection() {
     new Actions(driver).dragAndDropBy(sliderContainer,60,0).perform();
       return this;
    }

    @FindBy(id = "range")
    WebElement value;
    public HorizontalSliderPage assertSliderValue(String number) {
        Assert.assertEquals(getValueText(value),number);
        return this;
    }
}
