package com.techpeak.easerp.inventory.controllers;

import com.techpeak.easerp.inventory.models.ProductEntity;
import com.techpeak.easerp.inventory.services.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value ="api/v1/products")
public class ProductController {
  private final ProductService productService;

  @PostMapping
  public ResponseEntity<ProductEntity> addProduct(@RequestBody @Valid ProductEntity entity){
    return new ResponseEntity<>(productService.addProduct(entity), HttpStatus.CREATED);
  }


}
