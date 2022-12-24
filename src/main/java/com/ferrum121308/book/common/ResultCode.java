package com.ferrum121308.book.common;

/**
 * @Auther: th
 * @CreateTime: 2022/12/1 16:00
 * @Description:
 */
public enum ResultCode {

	//成功
	SUCCESS(0,"请求成功"),

	//失败
	ERROR(-1,"请求失败")

	;

	private final Integer code;
	private final String msg;

	ResultCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer code(){
		return code;
	}

	public String msg(){
		return msg;
	}

}
