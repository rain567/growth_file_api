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

import io.renren.modules.generator.entity.GfScoreContentEntity;
import io.renren.modules.generator.service.GfScoreContentService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 心得体会
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-23 15:13:11
 */
@RestController
@RequestMapping("generator/gfscorecontent")
public class GfScoreContentController {
    @Autowired
    private GfScoreContentService gfScoreContentService;


    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:gfscorecontent:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gfScoreContentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:gfscorecontent:info")
    public R info(@PathVariable("id") Long id){
		GfScoreContentEntity gfScoreContent = gfScoreContentService.getById(id);

        return R.ok().put("gfScoreContent", gfScoreContent);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:gfscorecontent:save")
    public R save(@RequestBody GfScoreContentEntity gfScoreContent){
		gfScoreContentService.save(gfScoreContent);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:gfscorecontent:update")
    public R update(@RequestBody GfScoreContentEntity gfScoreContent){
		gfScoreContentService.updateById(gfScoreContent);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:gfscorecontent:delete")
    public R delete(@RequestBody Long[] ids){
		gfScoreContentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
