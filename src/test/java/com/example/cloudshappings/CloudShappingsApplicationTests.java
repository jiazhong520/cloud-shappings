package com.example.cloudshappings;


import com.example.cloudshappings.entites.Goods;
import com.example.cloudshappings.entites.GoodsType;
import com.example.cloudshappings.page.GoodsPage;
import com.example.cloudshappings.repositoryes.GoodsRepository;
import com.example.cloudshappings.repositoryes.GoodsTypeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudShappingsApplicationTests {

    @Autowired
    GoodsRepository repository;
    @Autowired
    GoodsTypeRepository goodsTypeRepository;


    @Test
    public void contextLoads() {
       // goodsTypeRepository.save(new GoodsType("男装"));
       Goods goods=new Goods("hello",10000d,"good","../images/dog.gif",200,(byte)1,1,new GoodsType(1));
        repository.save(goods);
        goods=new Goods("hello",10000d,"good","../images/dog.gif",200,(byte)1,1,new GoodsType(1));
        repository.save(goods);
        goods=new Goods("hello",10000d,"good","../images/dog.gif",200,(byte)1,1,new GoodsType(1));
        repository.save(goods);
        goods=new Goods("hello",10000d,"good","../images/dog.gif",200,(byte)1,1,new GoodsType(1));
        repository.save(goods);
        goods=new Goods("hello",10000d,"good","../images/dog.gif",200,(byte)1,1,new GoodsType(1));
        repository.save(goods);
        goods=new Goods("hello",10000d,"good","../images/dog.gif",200,(byte)1,1,new GoodsType(1));
        repository.save(goods);
        goods=new Goods("hello",10000d,"good","../images/dog.gif",200,(byte)1,1,new GoodsType(1));
        repository.save(goods);
        goods=new Goods("hello",10000d,"good","../images/dog.gif",200,(byte)1,1,new GoodsType(1));
        repository.save(goods);
        goods=new Goods("hello",10000d,"good","../images/dog.gif",200,(byte)1,1,new GoodsType(1));
        repository.save(goods);


        //goodsTypeRepository.save(new GoodsType("男装"));
      //  System.out.println();
      //  System.out.println(gson.toJson(repository.findAll()));

//        Goods goods = repository.findById(1).get();
  //      String goodsTypeName = goods.getGoodsType().getGoodsTypeName();
    //    System.out.println(goodsTypeName);



    }

}
