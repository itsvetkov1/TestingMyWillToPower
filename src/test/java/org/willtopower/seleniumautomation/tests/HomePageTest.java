package org.willtopower.seleniumautomation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.willtopower.seleniumautomation.pages.HomePage;

public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Test
    public void testHomeBannerClick() {
        // Navigate to the website
        homePage.navigateTo();
        
        // Verify page is loaded
        Assert.assertTrue(homePage.isPageLoaded(), "Home page failed to load");
        
        // Click on home banner
        homePage.clickHomeBanner();
        
        // Verify we're still on the home page (or reloaded successfully)
        Assert.assertTrue(homePage.isPageLoaded(), "Home page not displayed after clicking banner");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
} 