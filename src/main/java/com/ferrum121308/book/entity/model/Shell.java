package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 15:10
 * @Description: 书架层
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shell {

	@TableId
	private Long shellId;
	private Long caseId;
	private String shellName;
	private String shellNum;
	private Integer totalBookAmount;
	private Integer currentBookAmount;
	private Date createTime;
	private Date updateTime;
	@TableLogic
	private Integer delStatus;

}
