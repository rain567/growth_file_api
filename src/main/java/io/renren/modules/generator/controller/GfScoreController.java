package io.renren.modules.generator.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.renren.modules.generator.dto.GfPhysicalTestDTO;
import io.renren.modules.generator.dto.GfScoreDTO;
import io.renren.modules.generator.entity.GfPhysicalTestEntity;
import io.renren.utils.DateUtils;
import io.renren.utils.ExcelUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.generator.entity.GfScoreEntity;
import io.renren.modules.generator.service.GfScoreService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import org.springframework.web.multipart.MultipartFile;


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


    /**
     *
     * @param file
     * @return
     */
    @PostMapping("/batchSave")
    public R saveAndGradeAndFile(@RequestParam(value="uploadFile", required = false) MultipartFile file){
        List<GfScoreDTO> list = ExcelUtils.readExcel("", GfScoreDTO.class, file);
        List<GfScoreEntity> collect = list.parallelStream()
                .map(item -> {
                    GfScoreEntity gfScoreEntity = new GfScoreEntity();
                    try {
                        BeanUtils.copyProperties(gfScoreEntity, item);
                        gfScoreEntity.setExamTime(DateUtils.stringToDate(item.getExamTimeStr(), "yyyy-MM-dd HH:mm:ss"));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return gfScoreEntity;
                }).collect(Collectors.toList());;
        gfScoreService.saveBatch(collect);
        return R.ok();
    }

}
