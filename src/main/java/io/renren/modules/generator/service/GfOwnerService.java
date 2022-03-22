package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.GfOwnerEntity;

import java.util.Map;

/**
 * 档案信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:55
 */
public interface GfOwnerService extends IService<GfOwnerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

