package org.example.assertions;

import org.assertj.core.api.SoftAssertions;
import org.example.models.Product;
import org.example.models.ProductDetails;
import org.example.responses.ProductDetailsResponse;
import org.example.responses.ProductResponse;

public class ProductAssertions {

    SoftAssertions softAssertions = new SoftAssertions();

    public void assertProductResponse(ProductResponse productResponse, Product expectedProduct) {

        softAssertions.assertThat(productResponse.getName()).isEqualTo(expectedProduct.getName());
        softAssertions.assertThat(productResponse.isInStock()).isEqualTo(expectedProduct.isInStock());
        softAssertions.assertThat(productResponse.getCategory()).isEqualTo(expectedProduct.getCategory());
        softAssertions.assertAll();
    }

    public void assertProductDetailsResponse(ProductDetailsResponse productDetailsResponse, ProductDetails expectedProductDetails) {

        softAssertions.assertThat(productDetailsResponse.getCategory()).isEqualTo(expectedProductDetails.getCategory());
        softAssertions.assertThat(productDetailsResponse.getCurrentStock()).isEqualTo(expectedProductDetails.getCurrentStock());
        softAssertions.assertThat(productDetailsResponse.getName()).isEqualTo(expectedProductDetails.getName());
        softAssertions.assertThat(productDetailsResponse.getManufacturer()).isEqualTo(expectedProductDetails.getManufacturer());
        softAssertions.assertThat(productDetailsResponse.getPrice()).isEqualTo(expectedProductDetails.getPrice());
        softAssertions.assertAll();
    }
}
