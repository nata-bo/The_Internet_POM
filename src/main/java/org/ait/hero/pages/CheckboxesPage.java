package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{


    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }
  @FindBy(css = "[type='checkbox']")
    WebElement checkbox;
    public CheckboxesPage selectCheckbox(String[] checkboxes) {
        for (int i = 0; i < checkboxes.length; i++) {
          if(checkboxes[i] != null){
             click(checkbox);
          }
        }
       return this;
    }
    public CheckboxesPage selectCheckbox2() {
        if (!checkbox.isSelected()) {
            System.out.println("Checkbox is not selected by default");
        }
                click(checkbox);

        if (checkbox.isSelected()) {
            System.out.println("Checkbox is selected after clicking");
        }
        return this;
    }
}
