package com.lotaproject.productservice.service;

import com.lotaproject.productservice.dto.CreateProductRequest;
import com.lotaproject.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    public void createProduct(CreateProductRequest request);

    List<ProductResponse> getAllProducts();
}
