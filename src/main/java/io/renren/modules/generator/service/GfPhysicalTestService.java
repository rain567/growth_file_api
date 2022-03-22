package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.GfPhysicalTestEntity;

import java.util.Map;

/**
 * 体测管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
public interface GfPhysicalTestService extends IService<GfPhysicalTestEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

