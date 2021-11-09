package com.ducla12.service;

import com.ducla12.model.BrandDatatablesModel;
import com.ducla12.model.CreateBrandRequest;

public interface BrandService {

    BrandDatatablesModel getAllBrand();

    void createBrand(CreateBrandRequest createBrandRequest);

}
