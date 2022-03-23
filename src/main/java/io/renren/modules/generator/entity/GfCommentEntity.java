package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 评论管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
@Data
@TableName("gf_comment")
public class GfCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 创建用户id
	 */
	private Long userId;
	/**
	 * 被评论者id
	 */
	private Long originUserId;
	/**
	 * 被评论者姓名
	 */
	private String originUserName;
	/**
	 * 评论内容
	 */
	private String content;
	/**
	 * 创建者姓名
	 */
	private String username;
	/**
	 * 评论者身份
	 */
	private Integer type;
	/**
	 * 操作人
	 */
	private String operator;
	/**
	 * 备注
	 */
	private String remark;

}
