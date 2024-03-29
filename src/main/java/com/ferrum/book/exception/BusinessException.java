package com.ferrum.book.exception;

import com.ferrum.book.entity.enums.ResultCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

/**
 * 描述：自定义异常
 * 创建时间： 2023/4/15 10:03
 *
 * @author th
 * @version 1.0
 */

@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException{

	private final Integer code;
	private final String msg;

	public BusinessException(Integer code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;
	}

	public BusinessException(String msg) {
		super(msg);
		this.code = ResultCodeEnum.FAILED.code();
		this.msg = msg;
	}

	public BusinessException(ResultCodeEnum resultCode) {
		super(resultCode.msg());
		this.code = resultCode.code();
		this.msg = resultCode.msg();
	}

}
