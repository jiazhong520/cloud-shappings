package com.example.cloudshappings.entites;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "goods")
public class Goods implements Serializable {

    /**
     * 商品主键
     */
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer goodsId;

    /**
     * 商品名称
     */
    @Column(name = "goodsName")
    private String goodsName;

    /**
     * 商品价格
     */
    @Column(name = "goods_price")
    private Double goodsPrice;
    /**
     * 商品图片地址
     */
    @Column(name = "goods_information")
    private String goodsInformation;
    /**
     * 商品图片地址
     */
    @Column(name = "goods_images_location")
    private String goodsImagesLocation;

    /**
     * 商品数量
     */
    @Column(name = "goods_count")
    private Integer goodsCount;

    /**
     * 商品是否可以买出  0 不可以 1 可以
     */
    @Column(name = "is_available")
    private Byte isAvailable ;

    /**

     * 商品销售的数量
     */
    @Column(name = "goods_sale")
    private Integer goodsSale;

    /**
     * 商品的类型
     */
    @Id
    @ManyToOne
    @JoinColumn(name = "type_id")
    private GoodsType goodsType;
    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsInformation='" + goodsInformation + '\'' +
                ", goodsImagesLocation='" + goodsImagesLocation + '\'' +
                ", goodsCount=" + goodsCount +
                ", isAvailable=" + isAvailable +
                ", goodsSale=" + goodsSale +
                ", goodsType=" + goodsType +
                '}';
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsInformation() {
        return goodsInformation;
    }

    public void setGoodsInformation(String goodsInformation) {
        this.goodsInformation = goodsInformation;
    }

    public String getGoodsImagesLocation() {
        return goodsImagesLocation;
    }

    public void setGoodsImagesLocation(String goodsImagesLocation) {
        this.goodsImagesLocation = goodsImagesLocation;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Byte getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Byte isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Integer getGoodsSale() {
        return goodsSale;
    }

    public void setGoodsSale(Integer goodsSale) {
        this.goodsSale = goodsSale;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public Goods(String goodsName, Double goodsPrice, String goodsInformation, String goodsImagesLocation, Integer goodsCount, Byte isAvailable, Integer goodsSale, GoodsType goodsType) {

        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsInformation = goodsInformation;
        this.goodsImagesLocation = goodsImagesLocation;
        this.goodsCount = goodsCount;
        this.isAvailable = isAvailable;
        this.goodsSale = goodsSale;
        this.goodsType = goodsType;
    }













}
