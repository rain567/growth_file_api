package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.GfScoreContentEntity;

import java.util.Map;

/**
 * 心得体会
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-23 15:13:11
 */
public interface GfScoreContentService extends IService<GfScoreContentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

