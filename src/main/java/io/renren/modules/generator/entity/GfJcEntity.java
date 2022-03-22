package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 奖惩
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:56
 */
@Data
@TableName("gf_jc")
public class GfJcEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 学生学号
	 */
	private String studentNo;
	/**
	 * 学生姓名
	 */
	private String name;
	/**
	 * 状态(1新建、2审核)
	 */
	private String status;
	/**
	 * 类型(1奖励、2惩罚)
	 */
	private String type;
	/**
	 * 录入人姓名
	 */
	private String createName;
	/**
	 * 审批人姓名
	 */
	private String auditName;
	/**
	 * 获奖/惩日期
	 */
	private Date getTime;
	/**
	 * 获奖/惩内容
	 */
	private String content;
	/**
	 * 材料相关证明
	 */
	private String cl;
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
