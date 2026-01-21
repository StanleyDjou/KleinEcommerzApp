// OrderDto.java
package com.example.ecommerce.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private LocalDateTime date;
    private BigDecimal total;
    private String status;
    private Long userId;
    private List<OrderItemDto> items;
}