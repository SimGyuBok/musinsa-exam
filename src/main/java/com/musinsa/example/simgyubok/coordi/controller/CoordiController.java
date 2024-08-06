package com.musinsa.example.simgyubok.coordi.controller;

import com.musinsa.example.simgyubok.coordi.service.BrandService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/coordi/v1")
public class CoordiController {
    private final BrandService brandService;

    @PostMapping(value="/brand")
    public Brand
}
