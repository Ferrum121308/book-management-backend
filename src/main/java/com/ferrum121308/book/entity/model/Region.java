package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 15:30
 * @Description: 图书类别
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region {

	@TableId
	private Long regionId;
	private String regionName;
	private String regionCode;
	private Date createTime;
	private Date updateTime;
	private Integer delStatus;

}
