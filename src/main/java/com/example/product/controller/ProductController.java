package com.example.product.controller;

import com.example.product.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable String productId) {
        return new Product(1L);
    }

    @PostMapping()
    public Product createProduct() {
        return new Product(1L);
    }
}
