package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.GfScoreContentDao;
import io.renren.modules.generator.entity.GfScoreContentEntity;
import io.renren.modules.generator.service.GfScoreContentService;


@Service("gfScoreContentService")
public class GfScoreContentServiceImpl extends ServiceImpl<GfScoreContentDao, GfScoreContentEntity> implements GfScoreContentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GfScoreContentEntity> page = this.page(
                new Query<GfScoreContentEntity>().getPage(params),
                new QueryWrapper<GfScoreContentEntity>()
        );

        return new PageUtils(page);
    }

}