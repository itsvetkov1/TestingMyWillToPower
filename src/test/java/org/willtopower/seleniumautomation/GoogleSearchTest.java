package org.willtopower.seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    void test() {
        driver.get("https://google.com");
        String title = driver.getTitle();
        assert(title).contains("Google");

    }
    @AfterClass
    void teardown() {
        driver.quit();
    }
}


