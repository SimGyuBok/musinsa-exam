package com.musinsa.example.simgyubok.coordi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categorySeq;
    private CategoryName categoryName;
    @OneToMany
    private List<Product> products;

    @Builder
    public Category(CategoryName categoryName) {
        this.categoryName = categoryName;
    }
}
