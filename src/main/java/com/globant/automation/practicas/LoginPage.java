package com.globant.automation.practicas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	String url = "https://missingchildren.globant.com";
	By usuarioInput = new By.ById("edit-name"); 
    By contraseñaInput = new By.ById("edit-pass");
    By iniciarSesionButton = new By.ById("edit-submit");
    
    public LoginPage(WebDriver driver) {
		this.driver = driver;
		driver.get(url);
	}
    
    public void login(String usuario, String contraseña) {
    	
    	driver.findElement(usuarioInput).sendKeys(usuario);
    	driver.findElement(contraseñaInput).sendKeys(contraseña);
    	driver.findElement(iniciarSesionButton).click();
    	
    }
   
}
