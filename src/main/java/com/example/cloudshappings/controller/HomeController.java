package com.example.cloudshappings.controller;

import com.alibaba.fastjson.JSON;
import com.example.cloudshappings.repositoryes.GoodsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired

    GoodsRepository repository;

    @PostMapping("/all")
    public String findGoods(){

        return JSON.toJSONString(repository.findAll());
    }

}
