package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 13:51
 * @Description: 后台管理用户
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser{

	@TableId
	private Long userId;
	private String username;
	private String nickName;
	private String userMobile;
	private String userEmail;
	private String loginPassword;
	private Integer status;
	@TableLogic
	private Integer delStatus;
	private Date createTime;
	private Date updateTime;

}
