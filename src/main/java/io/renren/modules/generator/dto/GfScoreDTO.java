package io.renren.modules.generator.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.renren.modules.generator.annotation.ExcelColumn;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 成绩
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-03-14 14:19:56
 */
@Data
public class GfScoreDTO implements Serializable {


	/**
	 * 学院
	 */
	@ExcelColumn(value = "学院", col = 2)
	private String institute;
	/**
	 * 所属班级
	 */
	@ExcelColumn(value = "班级", col = 3)
	private String className;
	/**
	 * 姓名
	 */
	@ExcelColumn(value = "姓名", col = 4)
	private String studentName;
	/**
	 * 学号
	 */
	@ExcelColumn(value = "学号", col = 5)
	private String studentNo;
	/**
	 * 考试科目
	 */
	@ExcelColumn(value = "考试科目", col = 6)
	private String course;
	/**
	 * 任课老师
	 */
	@ExcelColumn(value = "任课老师", col = 7)
	private String teacher;
	/**
	 * 分数
	 */
	@ExcelColumn(value = "分数", col = 8)
	private Double score;
	/**
	 * 学分
	 */
	@ExcelColumn(value = "学分", col = 9)
	private String credit;
	/**
	 * 考试时间
	 */
	@ExcelColumn(value = "考试时间", col = 10)
	private String examTimeStr;
	/**
	 * 考试类别
	 */
	@ExcelColumn(value = "考试类别", col = 11)
	private String type;
	/**
	 * 考试方式
	 */
	@ExcelColumn(value = "考试方式", col = 12)
	private String pattern;


}
