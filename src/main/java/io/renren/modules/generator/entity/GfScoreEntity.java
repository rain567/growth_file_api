package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 成绩
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:56
 */
@Data
@TableName("gf_score")
public class GfScoreEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 姓名
	 */
	private String studentName;
	/**
	 * 学号
	 */
	private String studentNo;
	/**
	 * 考试科目
	 */
	private String course;
	/**
	 * 任课老师
	 */
	private String teacher;
	/**
	 * 分数
	 */
	private Double score;
	/**
	 * 所属班级
	 */
	private String className;
	/**
	 * 学院
	 */
	private String institute;
	/**
	 * 考试时间
	 */
	private Date examTime;
	/**
	 * 考试类型
	 */
	private String type;
	/**
	 * 考试方式
	 */
	private String pattern;
	/**
	 * 学分
	 */
	private String credit;
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
