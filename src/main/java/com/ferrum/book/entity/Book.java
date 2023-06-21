package com.ferrum.book.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 书籍
 * </p>
 *
 * @author th
 * @since 2023-06-21
 */
@Getter
@Setter
@TableName("book")
public class Book {

    /**
     * 书籍Id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 书架Id
     */
    @TableField("shelf_id")
    private Long shelfId;

    /**
     * 书名
     */
    @TableField("name")
    private String name;

    /**
     * 作者
     */
    @TableField("author")
    private String author;

    /**
     * 出版社
     */
    @TableField("press")
    private String press;

    /**
     * 单价
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * ISBN号
     */
    @TableField("isbn")
    private String isbn;

    /**
     * 图书编号
     */
    @TableField("serial_num")
    private String serialNum;

    /**
     * 图书预览图片
     */
    @TableField("preview")
    private String preview;

    /**
     * 购买时间
     */
    @TableField("buy_time")
    private LocalDateTime buyTime;

    /**
     * 上架时间
     */
    @TableField("upload_time")
    private LocalDateTime uploadTime;

    /**
     * 删除标记，默认0未删除，1删除
     */
    @TableField("del_status")
    @TableLogic
    private Boolean delStatus;
}
