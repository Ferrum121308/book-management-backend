package com.ferrum121308.book.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ferrum121308.book.entity.model.WxUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: th
 * @CreateTime: 2022/12/24 14:19
 * @Description: 微信用户数据库接口
 */
@Mapper
public interface WxUserMapper extends BaseMapper<WxUser> {
}
