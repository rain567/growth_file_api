package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.GfCertificateEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 资格证书管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
@Mapper
public interface GfCertificateDao extends BaseMapper<GfCertificateEntity> {
	
}
