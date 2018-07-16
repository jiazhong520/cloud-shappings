package com.example.cloudshappings.page;

import com.example.cloudshappings.entites.Goods;

import java.util.List;

public class GoodsPage {

    private Integer curr;
    private Integer pageCount;

    @Override
    public String toString() {
        return "GoodsPage{" +
                "curr=" + curr +
                ", pageCount=" + pageCount +
                ", pageSize=" + pageSize +
                ", goods=" + goods +
                '}';
    }

    public GoodsPage(Integer curr, Integer pageCount, Integer pageSize, List<Goods> goods) {
        this.curr = curr;
        this.pageCount = pageCount;
        this.pageSize = pageSize;
        this.goods = goods;
    }

    public GoodsPage() {
    }

    public Integer getCurr() {
        return curr;
    }

    public void setCurr(Integer curr) {
        this.curr = curr;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    private Integer pageSize;
    private List<Goods> goods;



}
