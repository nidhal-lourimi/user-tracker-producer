package com.example.usertrackingproducer.model;

import com.example.usertrackingproducer.enums.Color;
import com.example.usertrackingproducer.enums.DesignType;
import com.example.usertrackingproducer.enums.ProductType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private Color color;
    private ProductType type;
    private DesignType designType;
}
