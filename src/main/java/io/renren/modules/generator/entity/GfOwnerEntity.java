package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 档案信息表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:55
 */
@Data
@TableName("gf_owner")
public class GfOwnerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 档案名称
	 */
	private String name;
	/**
	 * 档案主人学号
	 */
	private String ownerNo;
	/**
	 * 档案主任姓名
	 */
	private String ownerName;
	/**
	 * 家庭联系方式
	 */
	private String homePhone;
	/**
	 * 毕业时间
	 */
	private Date bysj;
	/**
	 * 入学时间
	 */
	private Date rxsj;
	/**
	 * 家庭住址
	 */
	private String jtzz;
	/**
	 * 状态(1新建、2审核)
	 */
	private Integer status;
	/**
	 * 出生日期
	 */
	private Date birthday;
	/**
	 * 政治面貌
	 */
	private String zzmm;
	/**
	 * 所属专业
	 */
	private String major;
	/**
	 * 所属班级
	 */
	private String userClass;
	/**
	 * 民族
	 */
	private String mz;
	/**
	 * 籍贯
	 */
	private String jg;
	/**
	 * 档案共享用户
	 */
	private String shareUser;
	/**
	 * 是否共享档案
	 */
	private String isShare;
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

	/**
	 * 辅导员id
	 */
	private String instructorId;

}
