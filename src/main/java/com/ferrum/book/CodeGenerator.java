package com.ferrum.book;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.fill.Property;

import java.util.Collections;

/**
 * 描述：代码生成器
 * 创建时间： 2023/6/21 13:41
 *
 * @author th
 * @version 1.0
 */
public class CodeGenerator {

	public static final String DATASOURCE_URL = "jdbc:mysql://121.40.207.27:23306/book_management?characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
	public static final String DATASOURCE_USER = "remote";
	public static final String DATASOURCE_PASSWORD = "Tieth@121308";


	public static void main(String[] args) {
		String currentPath = System.getProperty("user.dir");
		FastAutoGenerator.create(DATASOURCE_URL, DATASOURCE_USER, DATASOURCE_PASSWORD)
				.globalConfig(builder -> builder
						.author("th")
						.outputDir(currentPath + "\\src\\main\\java")
						.dateType(DateType.TIME_PACK)
						.commentDate("yyyy-MM-dd"))
				.packageConfig(builder -> builder
						.parent("com.ferrum.book")
						.entity("entity")
						.mapper("mapper")
						.xml("mapper")
						.service("service")
						.serviceImpl("service.impl")
						.controller("controller")
						.pathInfo(Collections.singletonMap(OutputFile.xml, currentPath + "\\src\\main\\resources\\mapper")))
				.strategyConfig(builder -> builder
						.entityBuilder()
						.disableSerialVersionUID()
						.enableFileOverride()
						.enableLombok()
						.enableTableFieldAnnotation()
						.idType(IdType.ASSIGN_ID)
						.logicDeletePropertyName("delStatus")
						.addTableFills(new Property("createTime", FieldFill.INSERT))
						.addTableFills(new Property("updateTime", FieldFill.INSERT_UPDATE))
						.mapperBuilder()
						.enableFileOverride()
						.enableBaseResultMap()
						.serviceBuilder()
						.enableFileOverride()
						.controllerBuilder()
						.enableFileOverride()
						.enableRestStyle()
				)
				.execute();
	}

}
