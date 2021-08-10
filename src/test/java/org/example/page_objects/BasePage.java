package org.example.page_objects;

import org.example.config.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import java.util.concurrent.TimeUnit;


public class BasePage {

    public WebDriver driver;
    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.driver.get(ConfProperties.getProperty("base_url"));
        this.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        this.driver.findElement(By.className("js-accept-cookies")).click();
    }
   
    //Navigation
    @FindBy(how = How.CLASS_NAME, using = "header__nav-toggle")
    private WebElement menuBtn;

    @FindBy(how = How.XPATH, using = "//*[@data-category=\"men-nav-custommade\"]")
    private WebElement submenuDesignYourOwn;

    @FindBy(how = How.XPATH, using = "//*[@automation-key-category-id=\"custom-made_jackets\"]")
    private WebElement submenuJacket;

    public void navigateDesignYourOwnJacket() {
        menuBtn.click();
        submenuDesignYourOwn.click();
        submenuJacket.click();
    }
}
