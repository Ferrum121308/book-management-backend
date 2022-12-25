package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.ferrum121308.book.entity.model.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 14:38
 * @Description: 书架——实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookCase extends BaseEntity {

	@TableId
	private Long caseId;
	private String caseName;
	private String caseNum;
	private Integer totalBookAmount;
	private Integer currentBookAmount;

	@TableField(exist = false)
	private List<Shell> shells;

}
