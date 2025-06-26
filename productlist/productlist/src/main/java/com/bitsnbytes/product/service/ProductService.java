package com.bitsnbytes.product.service;

import com.bitsnbytes.product.dto.ProductDTO;
import com.bitsnbytes.product.entity.Category;
import com.bitsnbytes.product.entity.Product;
import com.bitsnbytes.product.mapper.ProductMapper;
import com.bitsnbytes.product.repository.CategoryRepository;
import com.bitsnbytes.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService{

  private ProductRepository productRepository;
  private CategoryRepository categoryRepository;

  public ProductDTO createProduct(ProductDTO productDTO){

    Category category = categoryRepository.findById(productDTO.getCategoryId())
            .orElseThrow(() -> new RuntimeException("Category not found"));

    //DTO -> ENTITY
     Product product = ProductMapper.toProductEntity(productDTO, category);
     product = productRepository.save(product);

     //Entity -> DTO
    return ProductMapper.toProductDTO(product);

  }

}
