package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.GfOwnerDao;
import io.renren.modules.generator.entity.GfOwnerEntity;
import io.renren.modules.generator.service.GfOwnerService;


@Service("gfOwnerService")
public class GfOwnerServiceImpl extends ServiceImpl<GfOwnerDao, GfOwnerEntity> implements GfOwnerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Long instructorId = (Long)params.get("instructorId");
        IPage<GfOwnerEntity> page = this.page(
                new Query<GfOwnerEntity>().getPage(params),
                new QueryWrapper<GfOwnerEntity>()
                    .eq(instructorId != null, "instructor_id", instructorId)
        );

        return new PageUtils(page);
    }

}
