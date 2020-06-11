package com.aiz.zhelimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aiz.common.utils.PageUtils;
import com.aiz.zhelimall.coupon.entity.SmsSeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-11 22:34:09
 */
public interface SmsSeckillSkuNoticeService extends IService<SmsSeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

