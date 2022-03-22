package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.GfScoreDao;
import io.renren.modules.generator.entity.GfScoreEntity;
import io.renren.modules.generator.service.GfScoreService;


@Service("gfScoreService")
public class GfScoreServiceImpl extends ServiceImpl<GfScoreDao, GfScoreEntity> implements GfScoreService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GfScoreEntity> page = this.page(
                new Query<GfScoreEntity>().getPage(params),
                new QueryWrapper<GfScoreEntity>()
        );

        return new PageUtils(page);
    }

}