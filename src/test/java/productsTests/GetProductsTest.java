package productsTests;

import org.example.GroceryStore;
import org.example.assertions.ProductAssertions;
import org.example.models.Product;
import org.example.responses.ProductResponse;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetProductsTest {

    GroceryStore groceryStore = new GroceryStore();
    ProductAssertions productAssertions = new ProductAssertions();

    @DataProvider(name = "data")
    private Object[][] data() {
        return new Object[][] {
                {"meat-seafood"},
                {"candy"}
        };
    }

    @Test (dataProvider = "data")
    public void getAllProducts(String value) {

        // Given
        Product expectedProduct = new Product();
        expectedProduct.setCategory(value);

        if (value.equals("meat-seafood")) {
            expectedProduct.setName("Cosco Three Step Steel Platform");
            expectedProduct.setInStock(true);
        } else {
            expectedProduct.setName("Kinder Joy Eggs");
            expectedProduct.setInStock(true);
        }

        // When
        ProductResponse[] productResponses = groceryStore.getAllProducts(value);

        // Then
        productAssertions.assertProductResponse(productResponses[0], expectedProduct);
    }
}
