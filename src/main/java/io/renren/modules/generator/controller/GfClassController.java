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

import io.renren.modules.generator.entity.GfClassEntity;
import io.renren.modules.generator.service.GfClassService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 班级
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-02-22 22:41:46
 */
@RestController
@RequestMapping("generator/GfClass")
public class GfClassController {
    @Autowired
    private GfClassService GfClassService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:gf_class:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = GfClassService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:gf_class:info")
    public R info(@PathVariable("id") Long id){
		GfClassEntity GfClass = GfClassService.getById(id);

        return R.ok().put("GfClass", GfClass);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:gf_class:save")
    public R save(@RequestBody GfClassEntity GfClass){
		GfClassService.save(GfClass);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:gf_class:update")
    public R update(@RequestBody GfClassEntity GfClass){
		GfClassService.updateById(GfClass);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:gf_class:delete")
    public R delete(@RequestBody Long[] ids){
		GfClassService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
