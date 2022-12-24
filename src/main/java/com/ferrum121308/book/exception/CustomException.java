package com.ferrum121308.book.exception;

import com.ferrum121308.book.common.ResultCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Auther: th
 * @CreateTime: 2022/12/1 16:07
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomException extends RuntimeException{

	private final ResultCode resultCode;
	private final String errorMsg;

	public CustomException(ResultCode resultCode){
		this.resultCode = resultCode;
		this.errorMsg = super.getMessage();
	}

	public CustomException(ResultCode resultCode, String errorMsg){
		this.resultCode = resultCode;
		this.errorMsg = errorMsg;
	}

}
