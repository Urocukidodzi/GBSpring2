package com.geekbrains.spring.web.dto;

import com.geekbrains.spring.web.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
    private Long productId;
    private String productTitle;
    private int quantity;
    private int pricePerProduct;
    private int price;
//    private BigDecimal pricePerProduct;
//    private BigDecimal price;

    public OrderItemDto(Product product) {
        this.productId = product.getId();
        this.productTitle = product.getName();
        this.quantity = 1;
        this.pricePerProduct = product.getPrice();
        this.price = product.getPrice();

    }

    public void changeQuantity(int delta) {
        this.quantity += delta;
        this.price = this.quantity * this.pricePerProduct;
//        this.price = pricePerProduct.multiply(BigDecimal.valueOf(quantity));
    }
}
