package com.bitsnbytes.product.mapper;

import com.bitsnbytes.product.dto.ProductDTO;
import com.bitsnbytes.product.entity.Category;
import com.bitsnbytes.product.entity.Product;

public class ProductMapper {

    //entity to DTO
    public static ProductDTO toProductDTO(Product product){
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory().getId()
        );
    }
   //DTO in entity
    public static Product toProductEntity(ProductDTO productDTO, Category category){
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(product.getPrice());
        product.setCategory(category);

        return product;
    }
}
