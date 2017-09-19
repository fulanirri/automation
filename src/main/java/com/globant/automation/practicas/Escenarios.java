package com.globant.automation.practicas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class Escenarios 
{
    public static void main( String[] args )
    {        
       WebDriver driver = new FirefoxDriver();
       LoginPage page = new LoginPage(driver);
       page.login("","");
       driver.close();    
    }
   
}
