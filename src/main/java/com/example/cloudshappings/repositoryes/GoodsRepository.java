package com.example.cloudshappings.repositoryes;

import com.example.cloudshappings.entites.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepository extends JpaRepository<Goods,Integer> {

    List<Goods> findAll();




}
