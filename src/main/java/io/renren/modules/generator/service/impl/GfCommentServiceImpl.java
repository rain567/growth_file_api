package io.renren.modules.generator.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.GfCommentDao;
import io.renren.modules.generator.entity.GfCommentEntity;
import io.renren.modules.generator.service.GfCommentService;


@Service("gfCommentService")
public class GfCommentServiceImpl extends ServiceImpl<GfCommentDao, GfCommentEntity> implements GfCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Integer type = Integer.parseInt((String) params.get("type"));
        String userId = (String) params.get("userId");
        String originUserId = (String) params.get("originUserId");
        IPage<GfCommentEntity> page = this.page(
                new Query<GfCommentEntity>().getPage(params),
                new QueryWrapper<GfCommentEntity>()
                    .eq(type != null, "type", type)
                    .eq(StringUtils.isNotBlank(userId), "user_id", userId)
                    .eq(StringUtils.isNotBlank(originUserId), "origin_user_id", originUserId)
        );

        return new PageUtils(page);
    }

}
