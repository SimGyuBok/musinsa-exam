package com.musinsa.example.simgyubok.coordi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productSeq;
    private String productName;
    private Integer productPrice;
    @ManyToOne(fetch = FetchType.LAZY)
    private Brand brand;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @Builder
    public Product(String productName, Integer productPrice, Brand brand, Category category) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.brand = brand;
        this.category = category;
    }
}
