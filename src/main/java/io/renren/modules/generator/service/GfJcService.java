package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.GfJcEntity;

import java.util.Map;

/**
 * 奖惩
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:56
 */
public interface GfJcService extends IService<GfJcEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

