package com.developer.restapispringboot.controller;

import com.developer.restapispringboot.entity.Production;
import com.developer.restapispringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {

    @Autowired
    private ProductService  productService;

    @GetMapping("/")
    public List<Production> findAllProduction()
    {
        return productService.findAllProduct();
    }

    @GetMapping("/{name}")
    public List<Production> findAllProductByName(@PathVariable String name){
        return productService.findAllProductByName(name);
    }

    @PostMapping("/post")
    public Production saveProduct(@RequestBody Production production)
    {
        productService.saveProduct(production);
        return production;
    }

    @GetMapping("/id/{id}")
    public Production getProductById(@PathVariable Long id){
        return productService.findProductionById(id);
    }

}
