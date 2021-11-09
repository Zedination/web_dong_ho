package com.ducla12.service.impl;

import com.ducla12.entity.Brand;
import com.ducla12.model.BrandDatatablesModel;
import com.ducla12.model.BrandModel;
import com.ducla12.model.CreateBrandRequest;
import com.ducla12.repository.BrandRepository;
import com.ducla12.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Override
    public BrandDatatablesModel getAllBrand() {
        return BrandDatatablesModel.converter(this.brandRepository.findAll());
    }

    @Transactional
    @Override
    public void createBrand(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brand.setDescription(createBrandRequest.getDescription());
        this.brandRepository.save(brand);
    }

}
