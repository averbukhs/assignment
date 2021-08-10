package org.example.tests;

import org.example.page_objects.CM.JacketPage;
import org.example.setup.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.DEFAULT)
public class AddCMJacketToCart extends BaseTest {
    public static JacketPage jacketPage;

    @Test
    public void AddCMJacketToCartTest() {

        jacketPage = new JacketPage(driver);
        jacketPage.clickNextBtn();
        jacketPage.clickNextBtn();
        jacketPage.clickNextBtn();
        jacketPage.clickNextBtn();

        Assert.assertEquals(jacketPage.getCheckoutTxt(), "Checkout");

    }

}

