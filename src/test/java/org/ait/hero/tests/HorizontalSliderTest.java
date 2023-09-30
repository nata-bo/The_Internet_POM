package org.ait.hero.tests;

import org.ait.hero.pages.HomePage;
import org.ait.hero.pages.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends TestBase{

    @BeforeMethod
    public void precondition(){
         new HomePage(driver).getHorizontalSlider();
    }

    @Test
    public void sliderTest(){
        new HorizontalSliderPage(driver).moveSliderInHorizontalDirection()
                .assertSliderValue("5");
    }
}
