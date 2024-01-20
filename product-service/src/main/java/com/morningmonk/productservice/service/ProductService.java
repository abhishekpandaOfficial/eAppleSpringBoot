package com.morningmonk.productservice.service;

import com.morningmonk.productservice.dto.ProductRequest;
import com.morningmonk.productservice.dto.ProductResponse;
import com.morningmonk.productservice.model.Product;
import com.morningmonk.productservice.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final IProductRepository productRepository;


    public void createProduct(ProductRequest productRequest) {
        Product product  = Product.builder()
                            .name(productRequest.getName())
                            .description(productRequest.getDescription())
                            .price(productRequest.getPrice())
                            .build();
        productRepository.save(product);
        log.info("Product with  ID {} is created and Saved into database",product.getId());

    }

    public List<ProductResponse> getAllProducts()
    {
       List<Product> products = productRepository.findAll();
       return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
