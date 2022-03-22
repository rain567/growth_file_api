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

import io.renren.modules.generator.entity.GfJcEntity;
import io.renren.modules.generator.service.GfJcService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 奖惩
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:56
 */
@RestController
@RequestMapping("generator/gfjc")
public class GfJcController {
    @Autowired
    private GfJcService gfJcService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:gfjc:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gfJcService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:gfjc:info")
    public R info(@PathVariable("id") Long id){
		GfJcEntity gfJc = gfJcService.getById(id);

        return R.ok().put("gfJc", gfJc);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:gfjc:save")
    public R save(@RequestBody GfJcEntity gfJc){
		gfJcService.save(gfJc);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:gfjc:update")
    public R update(@RequestBody GfJcEntity gfJc){
		gfJcService.updateById(gfJc);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:gfjc:delete")
    public R delete(@RequestBody Long[] ids){
		gfJcService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
