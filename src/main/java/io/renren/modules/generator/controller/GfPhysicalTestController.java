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

import io.renren.modules.generator.entity.GfPhysicalTestEntity;
import io.renren.modules.generator.service.GfPhysicalTestService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 体测管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
@RestController
@RequestMapping("generator/gfphysicaltest")
public class GfPhysicalTestController {
    @Autowired
    private GfPhysicalTestService gfPhysicalTestService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:gfphysicaltest:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gfPhysicalTestService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:gfphysicaltest:info")
    public R info(@PathVariable("id") Long id){
		GfPhysicalTestEntity gfPhysicalTest = gfPhysicalTestService.getById(id);

        return R.ok().put("gfPhysicalTest", gfPhysicalTest);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:gfphysicaltest:save")
    public R save(@RequestBody GfPhysicalTestEntity gfPhysicalTest){
		gfPhysicalTestService.save(gfPhysicalTest);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:gfphysicaltest:update")
    public R update(@RequestBody GfPhysicalTestEntity gfPhysicalTest){
		gfPhysicalTestService.updateById(gfPhysicalTest);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:gfphysicaltest:delete")
    public R delete(@RequestBody Long[] ids){
		gfPhysicalTestService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
