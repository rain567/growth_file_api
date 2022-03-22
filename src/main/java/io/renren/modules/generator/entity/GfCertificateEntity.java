package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 资格证书管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
@Data
@TableName("gf_certificate")
public class GfCertificateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 获得者姓名
	 */
	private String userName;
	/**
	 * 获得者id
	 */
	private Long userId;
	/**
	 * 证书名称
	 */
	private String name;
	/**
	 * 证书级别
	 */
	private String level;
	/**
	 * 加分
	 */
	private Integer code;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 操作人
	 */
	private String operator;
	/**
	 * 备注
	 */
	private String remark;

}
