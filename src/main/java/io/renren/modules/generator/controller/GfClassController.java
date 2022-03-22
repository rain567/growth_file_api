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
 * @date 2022-03-14 14:19:55
 */
@RestController
@RequestMapping("generator/GFClass")
public class GfClassController {
    @Autowired
    private GfClassService gfClassService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:gfclass:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gfClassService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:gfclass:info")
    public R info(@PathVariable("id") Long id){
		GfClassEntity gfClass = gfClassService.getById(id);

        return R.ok().put("gfClass", gfClass);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:gfclass:save")
    public R save(@RequestBody GfClassEntity gfClass){
		gfClassService.save(gfClass);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:gfclass:update")
    public R update(@RequestBody GfClassEntity gfClass){
		gfClassService.updateById(gfClass);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:gfclass:delete")
    public R delete(@RequestBody Long[] ids){
		gfClassService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
