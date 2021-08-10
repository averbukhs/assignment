package org.example.page_objects.CM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;	

import org.example.config.ConfProperties;
import org.example.page_objects.BasePage;

public class JacketPage extends BasePage{

    public JacketPage(WebDriver driver) {
        super(driver);
        this.navigateDesignYourOwnJacket();
    }

    @FindBy(how = How.CSS, using = "div > div > ss-button.border-solid.width-full.background-dark.hydrated")
    private WebElement nextBtn;

    @FindBy(xpath = "//*[/html/body/div[1]/div[4]/div/div[2]/div[2]/div/div[4]/div/a]")
    private WebElement checkoutTxt;

    public void clickNextBtn() {
        nextBtn.click();        
    }; 

    public String getCheckoutTxt() {
        return checkoutTxt.getText();
    
    };
    

}