package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.ferrum121308.book.entity.model.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 15:30
 * @Description: 图书类别
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region extends BaseEntity {

	@TableId
	private Long regionId;
	private String regionName;
	private String regionCode;

}
