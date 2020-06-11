package com.aiz.zhelimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aiz.common.utils.PageUtils;
import com.aiz.zhelimall.coupon.entity.SmsCouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-11 22:34:10
 */
public interface SmsCouponService extends IService<SmsCouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

