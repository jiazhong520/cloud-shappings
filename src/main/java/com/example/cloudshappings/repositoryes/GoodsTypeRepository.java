package com.example.cloudshappings.repositoryes;

import com.example.cloudshappings.entites.GoodsType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsTypeRepository extends CrudRepository<GoodsType,Integer> {

}
