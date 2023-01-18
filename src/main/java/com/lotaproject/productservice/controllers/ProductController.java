package com.lotaproject.productservice.controllers;

import com.lotaproject.productservice.dto.CreateProductRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void  createProduct(@RequestBody CreateProductRequest createProductRequest){


    }

}
