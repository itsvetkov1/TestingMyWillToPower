package org.willtopower.seleniumautomation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By signInButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/login']");
    private By homeButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/']");
}
