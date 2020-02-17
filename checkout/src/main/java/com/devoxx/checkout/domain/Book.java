package com.devoxx.checkout.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    private String id;
    private String name;
    private BigDecimal price = BigDecimal.ZERO;
    private int stock = 0;
}

