package com.aiz.zhelimall.coupon.dao;

import com.aiz.zhelimall.coupon.entity.SmsCouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-11 22:34:10
 */
@Mapper
public interface SmsCouponSpuRelationDao extends BaseMapper<SmsCouponSpuRelationEntity> {
	
}
