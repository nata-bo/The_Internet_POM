package org.ait.hero.tests;

import org.ait.hero.data.Data;
import org.ait.hero.pages.FileUploadPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFileUpload();
    }

    @Test
    public void FileUploadTest(){
        new FileUploadPage(driver).uploadFile(Data.PHOTO_PATH)
                .verifyUploadedFiles("8.jpg");
    }
}
