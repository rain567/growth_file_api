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

import io.renren.modules.generator.entity.GfOwnerEntity;
import io.renren.modules.generator.service.GfOwnerService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 档案信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-05 21:05:06
 */
@RestController
@RequestMapping("generator/gfowner")
public class GfOwnerController {
    @Autowired
    private GfOwnerService gfOwnerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:gfowner:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gfOwnerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:gfowner:info")
    public R info(@PathVariable("id") Long id){
		GfOwnerEntity gfOwner = gfOwnerService.getById(id);

        return R.ok().put("gfOwner", gfOwner);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:gfowner:save")
    public R save(@RequestBody GfOwnerEntity gfOwner){
		gfOwnerService.save(gfOwner);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:gfowner:update")
    public R update(@RequestBody GfOwnerEntity gfOwner){
		gfOwnerService.updateById(gfOwner);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:gfowner:delete")
    public R delete(@RequestBody Long[] ids){
		gfOwnerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
