package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 心得体会
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-23 15:13:11
 */
@Data
@TableName("gf_score_content")
public class GfScoreContentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 内容
	 */
	private String content;
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

}
