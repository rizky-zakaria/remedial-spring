package com.developer.restapispringboot.service.impl;

import com.developer.restapispringboot.entity.Production;
import com.developer.restapispringboot.repository.ProductRepository;
import com.developer.restapispringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Production> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Production> findAllProductByName(String name) {
        return productRepository.findAllByName(name);
    }

    @Override
    public Production saveProduct(Production production) {
        return productRepository.save(production);
    }

    @Override
    public Production findProductionById(Long id) {
        return productRepository.findProductById(id);
    }
}
