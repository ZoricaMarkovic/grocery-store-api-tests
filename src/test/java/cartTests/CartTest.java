package cartTests;

import org.example.GroceryStore;
import org.example.requests.ItemRequest;
import org.example.responses.CartResponse;
import org.example.responses.ProductResponse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest {

    GroceryStore groceryStore = new GroceryStore();
    ItemRequest itemRequest = new ItemRequest();
    int productId;
    CartResponse cartResponse = new CartResponse();


    /**
     * Preconditions
     */
    @BeforeMethod
    private void beforeMethod() {

        ProductResponse[] productResponses = groceryStore.getAllProducts("meat-seafood");
        productId = productResponses[0].getId();

        cartResponse = groceryStore.createACart();
        itemRequest.setProductId(productId);
        itemRequest.setQuantity(1);
    }

    @Test
    public void createCart() {

        groceryStore.addItemToCart(itemRequest, cartResponse.getCartId());
    }
}
