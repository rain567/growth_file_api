package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.GfClassDao;
import io.renren.modules.generator.entity.GfClassEntity;
import io.renren.modules.generator.service.GfClassService;


@Service("gfClassService")
public class GfClassServiceImpl extends ServiceImpl<GfClassDao, GfClassEntity> implements GfClassService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GfClassEntity> page = this.page(
                new Query<GfClassEntity>().getPage(params),
                new QueryWrapper<GfClassEntity>()
        );

        return new PageUtils(page);
    }

}
