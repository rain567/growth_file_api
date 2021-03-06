package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.GfClassEntity;

import java.util.Map;

/**
 * 班级
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:55
 */
public interface GfClassService extends IService<GfClassEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

