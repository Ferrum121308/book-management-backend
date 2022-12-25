package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.ferrum121308.book.entity.model.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 14:08
 * @Description: 小程序登录用户
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WxUser extends BaseEntity {

	@TableId
	private Long userId;
	private String nickName;
	private String avatarUrl;
	private String sessionKey;
	private String openId;
	private String unionId;
	private Integer status;
	private String token;

}
