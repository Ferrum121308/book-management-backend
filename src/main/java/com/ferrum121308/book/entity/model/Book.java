package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.ferrum121308.book.entity.model.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 15:13
 * @Description: 书籍实体
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseEntity {

	@TableId
	private Long bookId;
	private String bookName;
	private String writer;
	private String publisher;
	private BigDecimal price;
	private String isbn;
	// 分类Id
	private Long regionId;
	// 书架Id
	private Long caseId;
	// 分层Id
	private Long shellId;
	// 位次
	private Integer position;
	// 是否借出 0默认未借出，1已借出
	private Integer lendStatus;

	// 上架时间
	private Date pushTime;
	@TableField(exist = false)
	private Region region;

}
