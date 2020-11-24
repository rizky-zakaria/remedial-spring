package com.developer.restapispringboot.service;

import com.developer.restapispringboot.entity.Cat;

import java.util.List;

public interface CatService {
    List<Cat> findAllProduct();
    List<Cat> findAllProductByName(String name);
    Cat saveCat(Cat cat);
    Cat findProductionById(Long id);
}
