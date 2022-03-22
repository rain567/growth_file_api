package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.GfCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评论管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
@Mapper
public interface GfCommentDao extends BaseMapper<GfCommentEntity> {
	
}
