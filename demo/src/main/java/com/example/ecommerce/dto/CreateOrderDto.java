package com.example.ecommerce.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;

public class CreateOrderDto {
    @NotNull
    private Long userId;

    @NotEmpty
    private List<CreateOrderItemDto> items;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<CreateOrderItemDto> getItems() {
        return items;
    }

    public void setItems(List<CreateOrderItemDto> items) {
        this.items = items;
    }
}

