package com.aiz.zhelimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aiz.common.utils.PageUtils;
import com.aiz.zhelimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-22 21:07:40
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

