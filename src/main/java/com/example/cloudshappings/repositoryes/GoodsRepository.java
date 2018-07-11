package com.example.cloudshappings.repositoryes;

import com.example.cloudshappings.entites.Goods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends CrudRepository<Goods,Integer> {


}
