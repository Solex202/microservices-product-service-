package com.lotaproject.productservice.service;

import com.lotaproject.productservice.dto.CreateProductRequest;
import com.lotaproject.productservice.model.Product;
import com.lotaproject.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    @Override
    public void createProduct(CreateProductRequest request) {
        Product product = Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .description(request.getDescription())
                .build();

        productRepository.save(product);

    }
}
