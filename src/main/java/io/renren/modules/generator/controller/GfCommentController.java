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

import io.renren.modules.generator.entity.GfCommentEntity;
import io.renren.modules.generator.service.GfCommentService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 评论管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
@RestController
@RequestMapping("generator/gfcomment")
public class GfCommentController {
    @Autowired
    private GfCommentService gfCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:gfcomment:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gfCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:gfcomment:info")
    public R info(@PathVariable("id") Long id){
		GfCommentEntity gfComment = gfCommentService.getById(id);

        return R.ok().put("gfComment", gfComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:gfcomment:save")
    public R save(@RequestBody GfCommentEntity gfComment){
		gfCommentService.save(gfComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:gfcomment:update")
    public R update(@RequestBody GfCommentEntity gfComment){
		gfCommentService.updateById(gfComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:gfcomment:delete")
    public R delete(@RequestBody Long[] ids){
		gfCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
