package com.aiz.zhelimall.coupon.dao;

import com.aiz.zhelimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-13 21:04:51
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
