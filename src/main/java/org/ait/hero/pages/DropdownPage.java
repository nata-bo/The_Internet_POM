package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class DropdownPage extends BasePage{
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;
    public DropdownPage selectAnOption(String option) {

        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
        System.out.println(select.getFirstSelectedOption().getText()+" is first");
        System.out.println("*************************************");

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        return this;
    }

    @FindBy(css = "[value='2']")
    WebElement value;
    public DropdownPage assertDropdownValue(String text) {
        Assert.assertEquals(getValueText(value),text);
    return this;
    }
}
