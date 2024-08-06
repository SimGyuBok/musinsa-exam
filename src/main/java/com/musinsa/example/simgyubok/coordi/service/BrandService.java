package com.musinsa.example.simgyubok.coordi.service;


import com.musinsa.example.simgyubok.coordi.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandService {
    private final BrandRepository brandRepository;

}
