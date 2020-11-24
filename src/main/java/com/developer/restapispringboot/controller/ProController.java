package com.developer.restapispringboot.controller;

import com.developer.restapispringboot.entity.Cat;
import com.developer.restapispringboot.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProController {

    @Autowired
    private CatService catService;

    @PostMapping("/cat")
    public Cat saveCat(@RequestBody Cat cat){
        catService.saveCat(cat);
        return cat;
    }

}
