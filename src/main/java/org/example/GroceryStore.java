package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.example.requests.ItemRequest;
import org.example.responses.CartResponse;
import org.example.responses.ProductDetailsResponse;
import org.example.responses.ProductResponse;

import static io.restassured.RestAssured.given;

public class GroceryStore {

    private static final String BASE_URL = "https://simple-grocery-store-api.glitch.me/";

    // Paths
    private static final String STATUS_PATH = "status";
    private static final String PRODUCTS_PATH = "products";
    private static final String CARTS_PATH = "carts";
    private static final String ITEMS_PATH = "items";
    private static final String ADD_ITEM_TO_CART_PATH = CARTS_PATH + "/{cartId}/" + ITEMS_PATH;
    private static final String SINGLE_PRODUCT_PATH = PRODUCTS_PATH + "/{productId}";

    // Path Params
    private static final String CART_ID_PATH_PARAMETER = "cartId";
    private static final String PRODUCT_ID_PATH_PARAMETER = "productId";

    // Query Params
    private static final String CATEGORY_QUERY_PARAMETER = "category";

    /**
     * Adding item to the Cart
     * @param itemRequest {ItemRequest}
     * @param cartId {Integer}
     */
    public void addItemToCart(ItemRequest itemRequest, String cartId) {
        getBaseSpec()
                .basePath(ADD_ITEM_TO_CART_PATH)
                .pathParam(CART_ID_PATH_PARAMETER, cartId)
                .body(itemRequest)
                .post()
                .then().statusCode(HttpStatus.SC_CREATED);
    }

    /**
     * Checks APIs status
     */
    public void getStatus() {
        getBaseSpec()
                .basePath(STATUS_PATH)
                .get()
                .then().statusCode(HttpStatus.SC_OK);
    }

    /**
     * Get All Products
     * @param categoryValue possibleValues:  meat-seafood, fresh-produce, candy, bread-bakery, dairy, eggs, coffee.
     * @return {ProductResponse[]}
     */
    public ProductResponse[] getAllProducts(String categoryValue) {
        Response response = getBaseSpec()
                .basePath(PRODUCTS_PATH)
                .queryParam(CATEGORY_QUERY_PARAMETER, categoryValue)
                .get();
        response.then().statusCode(HttpStatus.SC_OK);
        return response.as(ProductResponse[].class);
    }

    /**
     * Get Single Product
     * @param productId {Integer}
     * @return {ProductDetailsResponse}
     */
    public ProductDetailsResponse getSingleProduct(int productId) {
        Response response = getBaseSpec()
                .basePath(SINGLE_PRODUCT_PATH)
                .pathParam(PRODUCT_ID_PATH_PARAMETER, productId)
                .get();
        response.then().statusCode(HttpStatus.SC_OK);
        return response.as(ProductDetailsResponse.class);
    }

    /**
     * Creates a Cart
     * @return {CartResponse}
     */
    public CartResponse createACart() {
        Response response = getBaseSpec()
                .basePath(CARTS_PATH)
                .post();
        response.then().statusCode(HttpStatus.SC_CREATED);
        return response.as(CartResponse.class);
    }

    /**
     * Prepares a basic Request Specification
     * @return {RequestSpecification}
     */
    private RequestSpecification getBaseSpec() {
        return given()
                .relaxedHTTPSValidation()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON);
    }

}
