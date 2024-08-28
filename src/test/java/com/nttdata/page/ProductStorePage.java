package com.nttdata.page;
import org.openqa.selenium.By;

public class ProductStorePage {

    //Localizadores de elementos
    public static By userInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");
    public static By toLoginPageButton = By.xpath(
            "//div[@class='user-info']//a[@href]");
    public static By categoryClothes = By.xpath(
            "//div[@id='_desktop_top_menu']//a[@href]");
    public static By subCategoryMen = By.xpath(
            "//ul[@class='category-sub-menu']//li//a[text()='Men']");
    public static By selectFirstProduct = By.className("thumbnail-top");
    public static By selectItemsProducts = By.cssSelector(
            "span.input-group-btn-vertical button.btn-touchspin.bootstrap-touchspin-up");
    public static By addItemsProductsToCarrito = By.cssSelector(
            "div.add button.add-to-cart");
    public static By gettitlePopUp = By.className("cart-products-count");
    public static By closeModal = By.cssSelector(
            "div.cart-content-btn a.btn.btn-primary");
    public static By getTitleInCarritoPage = By.cssSelector("div.card-block h1.h1");
    public static By selectBtnFinalizarCompra = By.cssSelector("a.btn.btn-primary");

}
