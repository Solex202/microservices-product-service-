package com.lotaproject.productservice.service;

import com.lotaproject.productservice.dto.CreateProductRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
class ProductServiceImplTest {

    @Autowired
    ProductService productService;
    @Test
    void createProduct() {
        CreateProductRequest request = CreateProductRequest.builder()
                .name("shoe")
                .price(BigDecimal.valueOf(789))
                .description("big size")
                .build();

        productService.createProduct(request);
    }
}