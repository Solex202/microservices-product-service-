package com.lotaproject.productservice.controllers;

import com.lotaproject.productservice.dto.CreateProductRequest;
import com.lotaproject.productservice.repository.ProductRepository;
import com.lotaproject.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void  createProduct(@RequestBody CreateProductRequest createProductRequest){
        productService.createProduct(createProductRequest);




    }

}
