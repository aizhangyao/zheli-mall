package com.aiz.zhelimall.ware.service;

import com.aiz.zhelimall.ware.vo.SkuHasStockVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aiz.common.utils.PageUtils;
import com.aiz.zhelimall.ware.entity.WareSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-07-22 18:35:20
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);

    List<SkuHasStockVo> getSkusHasStock(List<Long> skuIds);
}

