package com.bitsnbytes.product.controller;

import com.bitsnbytes.product.dto.ProductDTO;
import com.bitsnbytes.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;
    //getProduct
    //createProduct
    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO){
      return productService.createProduct(productDTO);
    }
    //update Product
    //get Product by id


}
