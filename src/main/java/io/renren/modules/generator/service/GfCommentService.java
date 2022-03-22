package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.GfCommentEntity;

import java.util.Map;

/**
 * 评论管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
public interface GfCommentService extends IService<GfCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

