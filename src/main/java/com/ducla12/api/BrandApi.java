package com.ducla12.api;

import com.ducla12.model.BrandDatatablesModel;
import com.ducla12.model.CreateBrandRequest;
import com.ducla12.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/admin/brand")
public class BrandApi {

    private final BrandService brandService;

    @GetMapping("/find-all")
    public BrandDatatablesModel getAll() {
        return this.brandService.getAllBrand();
    }

    @PostMapping("/create")
    public void createBrand(@RequestBody CreateBrandRequest createBrandRequest) {
        this.brandService.createBrand(createBrandRequest);
    }

}
