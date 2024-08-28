package com.nttdata.stepsdefinitions;

import com.nttdata.steps.ProductStoreSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class ProductStoreStepsDef {
    private WebDriver driver;
    private ProductStoreSteps productStoreSteps;
    private ProductStoreSteps productStoreSteps(WebDriver driver){
        return new ProductStoreSteps(driver);
    }
    @Dado("estoy en la página de la tienda")
    public void estoyEnLaPáginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/es");
        screenShot();
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String user, String password) {
        productStoreSteps = new ProductStoreSteps(driver);
        productStoreSteps.toLoginPage();
        productStoreSteps.typeUser(user);
        productStoreSteps.typePassword(password);
        productStoreSteps.login();
        screenShot();
    }
    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String category, String subcategory) {
        productStoreSteps.category(category);
        screenShot();
        productStoreSteps.subcategory(subcategory);
        screenShot();
    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int item) {
        productStoreSteps.selectFirstProduct();
        screenShot();

        for (int i=1; i <= item-1; i++){
            productStoreSteps.selectItemsProducts();
        }
        screenShot();
        productStoreSteps.addItemsProductsToCarrito();
        screenShot();
    }

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregado() {
        String titlePopUp =  productStoreSteps(driver).getTitlePopUp();
        Assertions.assertNotNull(titlePopUp);
        screenShot();
    }


    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
    }
    @Cuando("finalizo la compra")
    public void finalizoLaCompra() {
        screenShot();
        productStoreSteps.closeModal();
    }

    @Entonces("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
        String titleInPageCarrito =  productStoreSteps(driver).titleInPageCarrito();
        Assertions.assertEquals("CARRITO",titleInPageCarrito);
        screenShot();
    }


    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        productStoreSteps.validateTotalinCarrito();
        screenShot();
    }
}
