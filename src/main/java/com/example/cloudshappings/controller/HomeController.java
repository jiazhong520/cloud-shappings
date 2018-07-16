package com.example.cloudshappings.controller;


import com.example.cloudshappings.entites.Goods;
import com.example.cloudshappings.page.GoodsPage;
import com.example.cloudshappings.repositoryes.GoodsRepository;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import sun.jvm.hotspot.HelloWorld;

@RestController
public class HomeController {
    @Autowired

    GoodsRepository repository;

    private Gson gson=new Gson();
    @RequestMapping("/pageInfo")
    public String findGoods(@RequestParam(name = "pageSize",defaultValue = "0") Integer pageSize, @RequestParam(name = "size",defaultValue = "5") Integer size){
        Page<Goods> all = repository.findAll(new PageRequest(pageSize, size));
        GoodsPage page=new GoodsPage();
        page.setCurr(1);
        System.out.println(all.getContent());
        page.setPageCount(all.getTotalPages());
        page.setPageSize((int)all.getTotalElements());


        return gson.toJson(page);
    }

    @PostMapping("/delete")
    public String deleteByid(Integer id){
      try {
          repository.deleteById(id);
          return "true";

      }catch (Exception e){
      e.printStackTrace();

      }

        return "false";
    }


    @RequestMapping("/all")
    public String pageInfo(Integer curr,Integer limit){
        Page<Goods> all = repository.findAll(new PageRequest(curr - 1, limit));


        return gson.toJson(all.getContent());
    }

}
