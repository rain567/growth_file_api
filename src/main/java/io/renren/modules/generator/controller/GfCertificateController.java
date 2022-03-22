package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.GfCertificateEntity;
import io.renren.modules.generator.service.GfCertificateService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 资格证书管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
@RestController
@RequestMapping("generator/gfcertificate")
public class GfCertificateController {
    @Autowired
    private GfCertificateService gfCertificateService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:gfcertificate:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gfCertificateService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:gfcertificate:info")
    public R info(@PathVariable("id") Long id){
		GfCertificateEntity gfCertificate = gfCertificateService.getById(id);

        return R.ok().put("gfCertificate", gfCertificate);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:gfcertificate:save")
    public R save(@RequestBody GfCertificateEntity gfCertificate){
		gfCertificateService.save(gfCertificate);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:gfcertificate:update")
    public R update(@RequestBody GfCertificateEntity gfCertificate){
		gfCertificateService.updateById(gfCertificate);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:gfcertificate:delete")
    public R delete(@RequestBody Long[] ids){
		gfCertificateService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
