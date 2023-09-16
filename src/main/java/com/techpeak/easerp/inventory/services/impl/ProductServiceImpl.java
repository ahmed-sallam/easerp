package com.techpeak.easerp.inventory.services.impl;

import com.techpeak.easerp.inventory.models.ProductEntity;
import com.techpeak.easerp.inventory.repositories.ProductRepository;
import com.techpeak.easerp.inventory.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
  private final ProductRepository productRepository;
  @Override
  public ProductEntity addProduct(ProductEntity product) {
    checkProductExists(product.getSKU());

    return productRepository.save(product);
  }

  private void checkProductExists(String SKU){
    Optional<ProductEntity> productEntity = productRepository.findBySKU(SKU);
    if (productEntity.isPresent())
      throw new IllegalStateException(String.format(" product already with SKU %s exists",SKU ));
  }





}
