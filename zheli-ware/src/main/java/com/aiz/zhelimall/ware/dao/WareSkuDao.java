package com.aiz.zhelimall.ware.dao;

import com.aiz.zhelimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 商品库存
 * 
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-07-22 18:35:20
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
    void addStock(@Param("skuId") Long skuId, @Param("wareId") Long wareId, @Param("skuNum") Integer skuNum);

    Long getSkuStock(@Param("skuId") Long skuId);
}
