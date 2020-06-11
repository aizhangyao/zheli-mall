package com.aiz.zhelimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aiz.common.utils.PageUtils;
import com.aiz.common.utils.Query;

import com.aiz.zhelimall.coupon.dao.SmsSeckillSkuNoticeDao;
import com.aiz.zhelimall.coupon.entity.SmsSeckillSkuNoticeEntity;
import com.aiz.zhelimall.coupon.service.SmsSeckillSkuNoticeService;


@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl extends ServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNoticeEntity> implements SmsSeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillSkuNoticeEntity> page = this.page(
                new Query<SmsSeckillSkuNoticeEntity>().getPage(params),
                new QueryWrapper<SmsSeckillSkuNoticeEntity>()
        );

        return new PageUtils(page);
    }

}