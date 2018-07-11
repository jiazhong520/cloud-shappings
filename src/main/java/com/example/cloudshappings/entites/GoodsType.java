package com.example.cloudshappings.entites;

import javax.persistence.*;

@Entity(name = "goodsType")
@Table(name = "goods_type")
public class GoodsType {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer typeId;
    @Column(name = "goods_type_name")
    private String  goodsTypeName;

    @Override
    public String toString() {
        return "GoodsType{" +
                "typeId=" + typeId +
                ", goodsTypeName='" + goodsTypeName + '\'' +
                '}';
    }

    public GoodsType() {
    }

    public Integer getTypeId() {

        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public GoodsType(String goodsTypeName) {

        this.goodsTypeName = goodsTypeName;
    }
}
