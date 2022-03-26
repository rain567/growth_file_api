package io.renren.modules.generator.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.renren.modules.generator.annotation.ExcelColumn;
import lombok.Data;

import java.io.Serializable;

/**
 * 体测管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 22:07:24
 */
@Data
public class GfPhysicalTestDTO implements Serializable {

	/**
	 * 所在学院
	 */
	@ExcelColumn(value = "学院", col = 2)
	private String faculty;
	/**
	 * 体测姓名
	 */
	@ExcelColumn(value = "姓名", col = 3)
	private String userName;
	/**
	 * 学号
	 */
	@ExcelColumn(value = "学号", col = 4)
	private Integer userNo;
	/**
	 * 年级
	 */
	@ExcelColumn(value = "年级", col = 5)
	private String grade;
	/**
	 * 长跑
	 */
	@ExcelColumn(value = "长跑", col = 6)
	private String longRun;
	/**
	 * 引体向上
	 */
	@ExcelColumn(value = "引体向上", col = 7)
	private String chinUp;
	/**
	 * 立定跳远
	 */
	@ExcelColumn(value = "立定跳远", col = 8)
	private String standingLongJump;
	/**
	 * 左立体前屈
	 */
	@ExcelColumn(value = "坐立体前屈", col = 9)
	private String seatBodyAnteflexion;
	/**
	 * 短跑
	 */
	@ExcelColumn(value = "短跑", col = 10)
	private String sprint;
	/**
	 * 肺活量
	 */
	@ExcelColumn(value = "肺活量", col = 11)
	private String pulmonary;
	/**
	 * 体重
	 */
	@ExcelColumn(value = "体重", col = 12)
	private String weight;
	/**
	 * 长跑得分
	 */
	@ExcelColumn(value = "长跑得分", col = 13)
	private Integer longRunScore;
	/**
	 * 引体向上得分
	 */
	@ExcelColumn(value = "引体向上得分", col = 14)
	private Integer chinUpScore;
	/**
	 * 立定跳远得分
	 */
	@ExcelColumn(value = "立定跳远得分", col = 15)
	private Integer standingLongJumpScore;
	/**
	 * 左立体前屈得分
	 */
	@ExcelColumn(value = "坐立体前屈得分", col = 16)
	private Integer seatBodyAnteflexionScore;
	/**
	 * 短跑得分
	 */
	@ExcelColumn(value = "短跑得分", col = 17)
	private Integer sprintScore;
	/**
	 * 肺活量得分
	 */
	@ExcelColumn(value = "肺活量得分", col = 18)
	private Integer pulmonaryScore;
	/**
	 * 身高体重得分
	 */
	@ExcelColumn(value = "身高体重得分", col = 19)
	private Integer statureWeightScore;
	/**
	 * 身高
	 */
	@ExcelColumn(value = "身高", col = 20)
	private Integer stature;
	/**
	 * 性别
	 */
	@ExcelColumn(value = "性别", col = 21)
	private String sex;
	/**
	 * 学年总分
	 */
	@ExcelColumn(value = "学年总分", col = 22)
	private String yearScore;



}
