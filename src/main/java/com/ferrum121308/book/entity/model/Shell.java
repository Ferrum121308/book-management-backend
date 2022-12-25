package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.ferrum121308.book.entity.model.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 15:10
 * @Description: 书架层
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shell extends BaseEntity {

	@TableId
	private Long shellId;
	private Long caseId;
	private String shellName;
	private String shellNum;
	private Integer totalBookAmount;
	private Integer currentBookAmount;

}
