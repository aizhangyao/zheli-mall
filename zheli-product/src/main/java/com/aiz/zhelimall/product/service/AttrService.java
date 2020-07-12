package com.aiz.zhelimall.product.service;

import com.aiz.zhelimall.product.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.aiz.common.utils.PageUtils;
import com.aiz.zhelimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-22 21:07:40
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);
}

