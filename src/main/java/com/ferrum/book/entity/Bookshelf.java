package com.ferrum.book.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

import lombok.*;

/**
 * <p>
 * 书柜
 * </p>
 *
 * @author th
 * @since 2023-06-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("bookshelf")
public class Bookshelf {

    /**
     * 书架Id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 书柜Id
     */
    @TableField("case_id")
    private Long caseId;

    /**
     * 书架编号
     */
    @TableField("code")
    private String code;

    /**
     * 登记时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 删除标记，默认0未删除，1删除
     */
    @TableField("del_status")
    @TableLogic
    private Boolean delStatus;
}
