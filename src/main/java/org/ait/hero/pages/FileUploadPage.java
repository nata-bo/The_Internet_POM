package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends BasePage{
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="file-upload")
    WebElement fileUpload;

    @FindBy(id="file-submit")
    WebElement fileSubmit;


    public FileUploadPage uploadFile(String photoPath) {
        fileUpload.sendKeys(photoPath);
        click(fileSubmit);
        return this;
    }

    @FindBy(id = "uploaded-files")
    WebElement uploadedFiles;
    public FileUploadPage verifyUploadedFiles(String text) {
        Assert.assertTrue(isTextPresent(uploadedFiles,text));
        return this;
    }
}
