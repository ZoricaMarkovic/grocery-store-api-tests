package productsTests;

import org.example.GroceryStore;
import org.example.assertions.ProductAssertions;
import org.example.models.ProductDetails;
import org.example.responses.ProductDetailsResponse;
import org.testng.annotations.Test;

public class GetSingleProductTest {

    GroceryStore groceryStore = new GroceryStore();
    ProductAssertions productAssertions = new ProductAssertions();

    @Test
    private void getSingleProduct() {

        // Given
        int productId = 1225;

        ProductDetails expectedProductDetails = new ProductDetails();
        expectedProductDetails.setCategory("fresh-produce");
        expectedProductDetails.setName("1/2 in. Brushless Hammer Drill");
        expectedProductDetails.setManufacturer("Bosch");
        expectedProductDetails.setPrice(12.98);
        expectedProductDetails.setCurrentStock(12);
        expectedProductDetails.setInStock(true);

        // When
        ProductDetailsResponse productDetailsResponse = groceryStore.getSingleProduct(productId);

        // Then
        productAssertions.assertProductDetailsResponse(productDetailsResponse, expectedProductDetails);

    }
}
