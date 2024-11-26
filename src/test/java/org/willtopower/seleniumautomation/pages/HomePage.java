package org.willtopower.seleniumautomation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //Action bar locators
    private By signInButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/login']");
    private By homeButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/']");
    private By productsButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/products']");
    private By cartButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/view_cart']");
    private By testCasesButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/test_cases']");
    private By apiTestingButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/api_list']");
    private By videoTutorialsButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='https://www.youtube.com/c/AutomationExercise']");
    private By contactUsButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/contact_us']");
    private By homeBannerButton = By.xpath("/html//header[@id='header']/div[@class='header-middle']//div[@class='logo pull-left']/a[@href='/']/img[@alt='Website for automation practice']");
    
}
