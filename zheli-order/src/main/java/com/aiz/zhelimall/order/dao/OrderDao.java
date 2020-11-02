package com.aiz.zhelimall.order.dao;

import com.aiz.zhelimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-10 23:19:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
