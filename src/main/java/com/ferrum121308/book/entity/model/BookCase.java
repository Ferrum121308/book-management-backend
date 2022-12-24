package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 14:38
 * @Description: 书架——实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookCase {

	@TableId
	private Long caseId;
	private String caseName;
	private String caseNum;
	private Integer totalBookAmount;
	private Integer currentBookAmount;
	private Date createTime;
	private Date updateTime;
	@TableLogic
	private Integer delStatus;

	@TableField(exist = false)
	private List<Shell> shells;

}
