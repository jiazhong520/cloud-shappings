package com.example.cloudshappings.entites;

import javax.persistence.*;

@Entity(name = "goods")
@Table(name = "goods")
public class Goods {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer goodsId;

    @Column(name = "goodsName")
    private String goodsName;



}
