package com.aiz.zhelimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aiz.common.utils.PageUtils;
import com.aiz.zhelimall.coupon.entity.SmsHomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-11 22:34:10
 */
public interface SmsHomeSubjectService extends IService<SmsHomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

