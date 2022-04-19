package com.devoxx.checkout.provider;

import com.devoxx.checkout.CheckoutApplication;
import com.devoxx.checkout.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
//@PactTestFor(providerName = "inventory-service", port = "8080")
//@ExtendWith(PactConsumerTestExt.class)
@ContextConfiguration(classes = {CheckoutApplication.class})
class InventoryContractTest {

    @Autowired
    private InventoryClient inventoryClient;

    /*
    @Pact(provider = "inventory-service", consumer = "checkout-service")
    public V4Pact getBookContract(PactBuilder builder) {
        return builder.usingLegacyDsl()
                .given("A product")
                .uponReceiving("Get a single product")
                .matchPath("/v1/books/.+")
                .method("GET")
                .willRespondWith()
                .status(200)
                .body(new PactDslJsonBody()
                        .stringType("id", "8f6413e9-a2a5-449d-a563-177d8acaaa63")
                        // Add the body content
                )
                .toPact(V4Pact.class);
    }*/

    @Test
    void test() {
        Book book = inventoryClient.retrieveBook("15");
        // Verify the content of book
    }

}