package com.developer.restapispringboot.service.impl;

import com.developer.restapispringboot.entity.Cat;
import com.developer.restapispringboot.repository.CatRepository;
import com.developer.restapispringboot.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {

    @Autowired
    private CatRepository catRepository;


    @Override
    public List<Cat> findAllProduct() {
        return null;
    }

    @Override
    public List<Cat> findAllProductByName(String name) {
        return null;
    }

    @Override
    public Cat saveCat(Cat cat) {
        return null;
    }

    @Override
    public Cat findProductionById(Long id) {
        return null;
    }
}
