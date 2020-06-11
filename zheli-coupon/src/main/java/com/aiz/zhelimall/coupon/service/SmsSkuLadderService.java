package com.aiz.zhelimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aiz.common.utils.PageUtils;
import com.aiz.zhelimall.coupon.entity.SmsSkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-11 22:34:09
 */
public interface SmsSkuLadderService extends IService<SmsSkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

