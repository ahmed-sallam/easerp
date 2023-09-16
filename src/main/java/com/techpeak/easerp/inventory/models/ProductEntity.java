package com.techpeak.easerp.inventory.models;

import com.techpeak.easerp.core.models.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity(name = "Product")
@Table(name = "products")
public class ProductEntity extends AbstractEntity {

  @NotNull
  private String name;
  private String description;
  @Positive
  private Double price;
  @NotNull
  @Column(unique = true)
  private String SKU;
}
