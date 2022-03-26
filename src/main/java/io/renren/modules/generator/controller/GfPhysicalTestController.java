package io.renren.modules.generator.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.renren.modules.generator.dto.GfPhysicalTestDTO;
import io.renren.utils.ExcelUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.renren.modules.generator.entity.GfPhysicalTestEntity;
import io.renren.modules.generator.service.GfPhysicalTestService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import org.springframework.web.multipart.MultipartFile;


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

    /**
     *
     * @param file
     * @return
     */
    @PostMapping("/batchSave")
    public R saveAndGradeAndFile(@RequestParam(value="uploadFile", required = false) MultipartFile file){
        List<GfPhysicalTestDTO> list = ExcelUtils.readExcel("", GfPhysicalTestDTO.class, file);
        List<GfPhysicalTestEntity> collect = list.parallelStream()
                .map(item -> {
                    GfPhysicalTestEntity gfPhysicalTestEntity = new GfPhysicalTestEntity();
                    try {
                        BeanUtils.copyProperties(gfPhysicalTestEntity, item);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return gfPhysicalTestEntity;
                }).collect(Collectors.toList());;
        gfPhysicalTestService.saveBatch(collect);
        return R.ok();
    }

}
