package com.ducla12.model;

import com.ducla12.entity.Brand;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Builder
public class BrandDatatablesModel {

    private List<List<String>> data;

    public static BrandDatatablesModel converter(List<Brand> brands) {
        List<List<String>> datas = new ArrayList<>();
        brands.forEach(brand -> datas.add(Arrays.asList(brand.getId().toString(),
                brand.getName(),
                brand.getDescription())));
        return BrandDatatablesModel.builder().data(datas).build();
    }

}
