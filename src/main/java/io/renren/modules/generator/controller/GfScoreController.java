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

import io.renren.modules.generator.entity.GfScoreEntity;
import io.renren.modules.generator.service.GfScoreService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 成绩
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:56
 */
@RestController
@RequestMapping("generator/gfscore")
public class GfScoreController {
    @Autowired
    private GfScoreService gfScoreService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:gfscore:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gfScoreService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:gfscore:info")
    public R info(@PathVariable("id") Long id){
		GfScoreEntity gfScore = gfScoreService.getById(id);

        return R.ok().put("gfScore", gfScore);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:gfscore:save")
    public R save(@RequestBody GfScoreEntity gfScore){
		gfScoreService.save(gfScore);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:gfscore:update")
    public R update(@RequestBody GfScoreEntity gfScore){
		gfScoreService.updateById(gfScore);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:gfscore:delete")
    public R delete(@RequestBody Long[] ids){
		gfScoreService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
