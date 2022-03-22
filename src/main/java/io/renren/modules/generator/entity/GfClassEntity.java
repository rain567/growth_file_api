package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 班级
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:55
 */
@Data
@TableName("gf_class")
public class GfClassEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 班级名称
	 */
	private String name;
	/**
	 * 所在专业
	 */
	private String faculty;
	/**
	 * 所在学院
	 */
	private String institute;
	/**
	 * 辅导员姓名
	 */
	private String instructor;
	/**
	 * 辅导员id
	 */
	private String instructorId;
	/**
	 * 班主任姓名
	 */
	private String bzr;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 操作人
	 */
	private String operator;
	/**
	 * 备注
	 */
	private String remark;

}
