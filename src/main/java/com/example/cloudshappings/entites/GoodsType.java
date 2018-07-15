package com.example.cloudshappings.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class GoodsType implements Serializable {
    /**
     * 商品类型主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "type_id")
    private Integer typeId;

    @Override
    public String toString() {
        return "GoodsType{" +
                "typeId=" + typeId +
                ", goodsTypeName='" + goodsTypeName + '\'' +
                ", goods=" + goods +
                '}';
    }

    /**
     * 商品类型名称
     */
    public GoodsType(Integer typeId){
        this.typeId=typeId;
    }
    @Column(name = "goods_type_name")
    private String  goodsTypeName;



    public GoodsType() {
    }

    public Integer getTypeId() {

        return typeId;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    @OneToMany(targetEntity = Goods.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id",referencedColumnName = "type_id")
    private List<Goods> goods;

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
