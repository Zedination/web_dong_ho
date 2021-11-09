package com.ducla12.model;

import com.ducla12.entity.Brand;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class BrandModel {

    private String id;

    private String name;

    private String description;

    public static BrandModel conveter(Brand brand) {
        return BrandModel.builder().id(brand.getId().toString())
                .name(brand.getName())
                .description(brand.getDescription()).build();
    }
}
