package com.developer.restapispringboot.service;

import com.developer.restapispringboot.entity.Production;

import java.util.List;

public interface ProductService {

    List<Production> findAllProduct();
    List<Production> findAllProductByName(String name);
    Production saveProduct(Production production);
    Production findProductionById(Long id);

}
