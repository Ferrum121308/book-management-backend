package com.ferrum.book.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 描述：自定义填充处理器
 * 创建时间： 2023/6/30 17:47
 *
 * @author th
 * @version 1.0
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
	@Override
	public void insertFill(MetaObject metaObject) {
		this.strictInsertFill(metaObject, "createTime", LocalDateTime::now, LocalDateTime.class);
		this.strictInsertFill(metaObject, "updateTime", LocalDateTime::now, LocalDateTime.class);
	}

	@Override
	public void updateFill(MetaObject metaObject) {
		this.strictUpdateFill(metaObject, "updateTime", LocalDateTime::now, LocalDateTime.class);
	}
}
