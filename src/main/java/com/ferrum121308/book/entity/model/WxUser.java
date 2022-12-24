package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 14:08
 * @Description: 小程序登录用户
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WxUser implements Serializable {

	@TableId
	private Long userId;
	private String nickName;
	private String avatarUrl;
	private String sessionKey;
	private String openId;
	private String unionId;
	private Integer status;
	private String token;
	private Date createTime;
	private Date updateTime;
	@TableLogic
	private Integer delStatus;

}
