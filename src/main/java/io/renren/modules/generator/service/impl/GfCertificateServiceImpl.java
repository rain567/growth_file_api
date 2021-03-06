package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.GfCertificateDao;
import io.renren.modules.generator.entity.GfCertificateEntity;
import io.renren.modules.generator.service.GfCertificateService;


@Service("gfCertificateService")
public class GfCertificateServiceImpl extends ServiceImpl<GfCertificateDao, GfCertificateEntity> implements GfCertificateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GfCertificateEntity> page = this.page(
                new Query<GfCertificateEntity>().getPage(params),
                new QueryWrapper<GfCertificateEntity>()
        );

        return new PageUtils(page);
    }

}