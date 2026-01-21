// CreateOrderDto.java
package com.example.ecommerce.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.List;

@Data
public class CreateOrderDto {
    @NotNull
    private Long userId;

    @NotEmpty
    private List<CreateOrderItemDto> items;
}

