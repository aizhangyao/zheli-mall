package com.aiz.zhelimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aiz.common.utils.PageUtils;
import com.aiz.zhelimall.coupon.entity.SmsSpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-11 22:34:09
 */
public interface SmsSpuBoundsService extends IService<SmsSpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

