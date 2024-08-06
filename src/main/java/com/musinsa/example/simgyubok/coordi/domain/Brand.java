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
@Table(name="brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandSeq;
    private String brandName;
    @OneToMany
    private List<Product> products;

    @Builder
    public Brand(String brandName) {
        this.brandName = brandName;
    }
}
