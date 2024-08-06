package com.musinsa.example.simgyubok.coordi.domain;

import lombok.Getter;

import java.util.Arrays;

public enum CategoryName {
    TOP("상의"),
    OUTER("아우터"),
    PANTS("바지"),
    SNICKERS("스니커즈"),
    BAG("가방"),
    HAT("모자"),
    SOCKS("양말"),
    ACCESSORIES("악세사리");

    @Getter
    private final String categoryName;

    CategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public static CategoryName getInstance(String name) {
        return Arrays.stream(values())
                .filter(categoryName -> categoryName.getCategoryName().equals(name))
                .findFirst()
                .orElseThrow();
    }
}
