package org.ait.hero.tests;

import org.ait.hero.pages.BrokenImagesPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase{

    @BeforeMethod
    public  void precondition(){
        new HomePage(driver).getBrokenImages();
    }

    @Test
    public void checkBrokenImages(){
        new BrokenImagesPage(driver).checkBrokenImages();
    }

}
