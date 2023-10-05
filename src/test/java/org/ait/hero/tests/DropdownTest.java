package org.ait.hero.tests;

import org.ait.hero.pages.DropdownPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdown();
    }

    @Test
    public void DropdownTest(){
        new DropdownPage(driver).selectAnOption("Option 2")
                .assertDropdownValue("Option 2");
    }
}
