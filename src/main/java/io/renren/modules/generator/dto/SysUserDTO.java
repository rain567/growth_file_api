package io.renren.modules.generator.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.renren.common.validator.group.AddGroup;
import io.renren.common.validator.group.UpdateGroup;
import io.renren.modules.generator.annotation.ExcelColumn;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 系统用户
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:56
 */
@Data
public class SysUserDTO implements Serializable {

	/**
	 * 所在学院
	 */
	@ExcelColumn(value = "学院", col = 2)
	private String faculty;
	/**
	 * 班级
	 */
	@ExcelColumn(value = "班级", col = 3)
	private String userClass;
	/**
	 * 学号/工号
	 */
	@ExcelColumn(value = "学号", col = 4)
	private String no;
	/**
	 * 姓名
	 */
	@ExcelColumn(value = "姓名", col = 5)
	private String name;
	/**
	 * 手机号
	 */
	@ExcelColumn(value = "手机号", col = 6)
	private String mobile;


}
