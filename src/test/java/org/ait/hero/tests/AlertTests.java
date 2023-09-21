package org.ait.hero.tests;

import org.ait.hero.pages.AlertsPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase{

    //click on link JavaScript Alerts
    @BeforeMethod
    public  void precondition(){
        new HomePage(driver).getAlerts();
    }

    @Test
    public void acceptAlertTest(){
        //click on the button Click for JS Alert
        //click on OK
        //assert text result 'You successfully clicked an alert'
        new AlertsPage(driver).clickOnAlertButton()
                .acceptAlert()
                .verifyResult("You successfully clicked an alert");
    }


    @Test
    public void confirmAlertTest(){
        //click on the button Click for JS Confirm
        //select ok | cancel
        //assert text result ok | cancel
        new AlertsPage(driver).clickOnConfirmButton()
                .selectConfirm("cancel")
                .verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAlertTest(){
        //click on the button Click for JS Prompt
        //enter 'Hello World!!!'
        //click on OK
        //assert text result 'Hello World!!!'
        new AlertsPage(driver).clickOnPromptButton()
                .enterMessageToAlert("Hello World!!!")
                .acceptAlert()
                .verifyResult("Hello World!!!");
    }

}
