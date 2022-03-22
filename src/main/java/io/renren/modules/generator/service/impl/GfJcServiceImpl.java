package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.GfJcDao;
import io.renren.modules.generator.entity.GfJcEntity;
import io.renren.modules.generator.service.GfJcService;


@Service("gfJcService")
public class GfJcServiceImpl extends ServiceImpl<GfJcDao, GfJcEntity> implements GfJcService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GfJcEntity> page = this.page(
                new Query<GfJcEntity>().getPage(params),
                new QueryWrapper<GfJcEntity>()
        );

        return new PageUtils(page);
    }

}