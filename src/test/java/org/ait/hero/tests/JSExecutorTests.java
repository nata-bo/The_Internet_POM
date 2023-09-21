package org.ait.hero.tests;

import org.ait.hero.data.UserData;
import org.ait.hero.pages.HomePage;
import org.ait.hero.pages.JSExecutor;
import org.testng.annotations.Test;

public class JSExecutorTests extends TestBase{

    @Test
    public void JsExecutorTest(){
        new HomePage(driver).getFormAuthentication();
        new JSExecutor(driver).enterDataWithJSE(UserData.USER_NAME,UserData.USER_PASSWORD)
                .clickOnLoginButtonWithJSE()
                .checkURLWithJSE();
    }
}
