// CreateOrderItemDto.java
package com.example.ecommerce.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CreateOrderItemDto {
    @NotNull
    private Long productId;

    @NotNull
    @Positive
    private Integer quantity;
}