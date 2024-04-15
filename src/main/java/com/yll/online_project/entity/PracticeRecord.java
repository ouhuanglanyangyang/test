package com.yll.online_project.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PracticeRecord {
    @ApiModelProperty(value = "练题记录id")
    private Integer id;
    @ApiModelProperty(value = "题目id")
    private String question_id;
    @ApiModelProperty(value = "学生学号")
    private String student_id;
    @ApiModelProperty(value = "是否为错题 0、不是错题 1、是错题",required = true)
    private Integer isWrong;
    @ApiModelProperty(value = "是否收藏 0、不收藏 1、收藏",required = true)
    private Integer isCollect;
    @ApiModelProperty(value = "是否有笔记 0、没有笔记 1、有笔记")
    private String isNote;
    @ApiModelProperty(value = "错题id")
    private String wrongId;
    @ApiModelProperty(value = "收藏id")
    private String collectId;
    @ApiModelProperty(value = "笔记id")
    private String noteId;
    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
}
