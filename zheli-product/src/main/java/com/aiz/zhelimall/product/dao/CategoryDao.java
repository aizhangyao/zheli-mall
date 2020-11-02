package com.aiz.zhelimall.product.dao;

import com.aiz.zhelimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-22 21:07:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
