package com.ferrum121308.book.entity.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.ferrum121308.book.entity.model.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 13:51
 * @Description: 后台管理用户
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser extends BaseEntity {

	@TableId
	private Long userId;
	private String username;
	private String nickName;
	private String userMobile;
	private String userEmail;
	private String loginPassword;
	private Integer status;

}
