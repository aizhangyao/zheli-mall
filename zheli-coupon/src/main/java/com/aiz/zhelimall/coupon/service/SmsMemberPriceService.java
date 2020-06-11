package com.aiz.zhelimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aiz.common.utils.PageUtils;
import com.aiz.zhelimall.coupon.entity.SmsMemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-11 22:34:10
 */
public interface SmsMemberPriceService extends IService<SmsMemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

