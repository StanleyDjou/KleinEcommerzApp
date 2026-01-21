// OrderItemDto.java
package com.example.ecommerce.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long id;
    private Integer quantity;
    private BigDecimal price;
    private Long productId;
    private String productName;
}
