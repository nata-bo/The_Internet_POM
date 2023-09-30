package org.ait.hero.tests;

import org.ait.hero.pages.FramesPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFrames();
    }

    @Test
    public void handleNestedFramesTest(){
        new FramesPage(driver).clickToNestedFrames()
                .handleNestedFrames();

    }

    @Test
    public void iFrameTest(){
        new FramesPage(driver).clickToIframe()
                .returnListOfFrames()
                .switchToIframeByIndex(0);

    }

}
