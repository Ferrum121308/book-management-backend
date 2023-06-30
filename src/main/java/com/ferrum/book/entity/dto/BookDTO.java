package com.ferrum.book.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 描述：书本信息后管信息传输实体
 * 创建时间： 2023/6/30 18:17
 *
 * @author th
 * @version 1.0
 */

@Data
@NoArgsConstructor
public class BookDTO {

	private Long id;
	private Long shelfId;
	private String name;
	private String author;
	private BigDecimal price;
	private String isbn;
	private String serialNum;
	private String preview;
	private LocalDateTime buyTime;
	private LocalDateTime uploadTime;

}
