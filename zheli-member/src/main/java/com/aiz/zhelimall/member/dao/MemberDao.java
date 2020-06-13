package com.aiz.zhelimall.member.dao;

import com.aiz.zhelimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Zhang Yao
 * @email zhangyao9707@163.com
 * @date 2020-06-13 21:15:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
