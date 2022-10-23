import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ProductsPage;
import pages.bioekdswebtest;

public class bioekdswebmain extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    bioekdswebtest bioekdswebtest;

    @Test
    @Order(1)
//    @Disabled("Due to BUG-123 disabled")
    public void search_a_product() {
        homePage = new HomePage(driver);
        System.out.println("ilhangursel");
        homePage.bioekdswebtest().startLoginPage(data.get(0).get(0));

        homePage.bioekdswebtest().deleteText();



        productsPage = new ProductsPage(driver);


        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");
    }





/*
    @Test
    @Order(2)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPag e.isOnProductDetailPage(),
                "Not on product detail page!");
    }


*/

}
