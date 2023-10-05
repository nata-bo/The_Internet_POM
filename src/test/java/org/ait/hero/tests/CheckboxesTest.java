package org.ait.hero.tests;

import org.ait.hero.data.Data;
import org.ait.hero.pages.CheckboxesPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getCheckboxes();
    }

    @Test
    public void selectCheckboxTest(){
        new CheckboxesPage(driver).selectCheckbox(Data.CHECKBOX);
    }
    @Test
    public void selectCheckboxTest2(){
        new CheckboxesPage(driver).selectCheckbox2();
    }
}
