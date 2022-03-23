package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 体测管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
@Data
@TableName("gf_physical_test")
public class GfPhysicalTestEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 体测姓名
	 */
	private String userName;
	/**
	 * 学号
	 */
	private Integer userNo;
	/**
	 * 体测学生
	 */
	private Long userId;
	/**
	 * 长跑
	 */
	private String longRun;
	/**
	 * 引体向上
	 */
	private String chinUp;
	/**
	 * 立定跳远
	 */
	private String standingLongJump;
	/**
	 * 左立体前屈
	 */
	private String seatBodyAnteflexion;
	/**
	 * 短跑
	 */
	private String sprint;
	/**
	 * 肺活量
	 */
	private String pulmonary;
	/**
	 * 体重
	 */
	private String weight;
	/**
	 * 长跑得分
	 */
	private Integer longRunScore;
	/**
	 * 引体向上得分
	 */
	private Integer chinUpScore;
	/**
	 * 立定跳远得分
	 */
	private Integer standingLongJumpScore;
	/**
	 * 左立体前屈得分
	 */
	private Integer seatBodyAnteflexionScore;
	/**
	 * 短跑得分
	 */
	private Integer sprintScore;
	/**
	 * 肺活量得分
	 */
	private Integer pulmonaryScore;
	/**
	 * 身高体重得分
	 */
	private Integer statureWeightScore;
	/**
	 * 身高
	 */
	private Integer stature;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 所在学院
	 */
	private String faculty;
	/**
	 * 操作人
	 */
	private String operator;
	/**
	 * 备注
	 */
	private String remark;

}
