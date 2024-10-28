package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class octoprojectpageobjectmodel {
    WebDriver driver;
 
    
    public octoprojectpageobjectmodel(WebDriver driver) {
    	
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize the elements
        driver.get("https://www.adidas.co.in/");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/header/div[2]/div/div[2]/button[1]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Shawnaloysious@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pms-checkbox-doc-mrkt-email-club:adidas:IN:2023710\"]/div/div/label")).click();
        driver.findElement(By.xpath("//*[@id=\"pms-checkbox-doc-tnc-memb:adidas:IN:2023112\"]/div/div/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"gl-modal__main-content-mf-account-portal\"]/div/div/div/form/div[7]/div/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"two-step-form-button\"]/span[1]")).click();
    }
        
    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "submit")
    WebElement submitButton;

    public void register(String username, String password, String email) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        emailField.sendKeys(email);
        submitButton.click();
    }
}