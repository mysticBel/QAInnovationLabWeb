package com.nttdata.steps;

import com.nttdata.page.ProductStorePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ProductStoreSteps {

    private WebDriver driver;

    //constructor
    public ProductStoreSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Redireccionamiento al login
     */
    public void toLoginPage() {this.driver.findElement(ProductStorePage.toLoginPageButton).click();}

    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(ProductStorePage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductStorePage.loginButton));
    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(ProductStorePage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){
        this.driver.findElement(ProductStorePage.loginButton).click();
    }


    public void category(String category) {
        this.driver.findElement(ProductStorePage.categoryClothes).click();
    }

    public void subcategory(String subcategory) {
        this.driver.findElement(ProductStorePage.subCategoryMen).click();
    }

    public void selectFirstProduct() {
        this.driver.findElement(ProductStorePage.selectFirstProduct).click();
    }
    public void selectItemsProducts() {
        this.driver.findElement(ProductStorePage.selectItemsProducts).click();
    }

    public void addItemsProductsToCarrito() {
        this.driver.findElement(ProductStorePage.addItemsProductsToCarrito).click();
    }
    public String getTitlePopUp(){
        return this.driver.findElement(ProductStorePage.gettitlePopUp).getText();
    }
    public void validateTotalinCarrito() {
        this.driver.findElement(ProductStorePage.selectBtnFinalizarCompra).click();
    }
    public void closeModal() {
        this.driver.findElement(ProductStorePage.closeModal).click();
    }
    public String titleInPageCarrito(){
        return this.driver.findElement(ProductStorePage.getTitleInCarritoPage).getText();
    }

}
