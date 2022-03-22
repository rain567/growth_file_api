package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.GfPhysicalTestDao;
import io.renren.modules.generator.entity.GfPhysicalTestEntity;
import io.renren.modules.generator.service.GfPhysicalTestService;


@Service("gfPhysicalTestService")
public class GfPhysicalTestServiceImpl extends ServiceImpl<GfPhysicalTestDao, GfPhysicalTestEntity> implements GfPhysicalTestService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GfPhysicalTestEntity> page = this.page(
                new Query<GfPhysicalTestEntity>().getPage(params),
                new QueryWrapper<GfPhysicalTestEntity>()
        );

        return new PageUtils(page);
    }

}