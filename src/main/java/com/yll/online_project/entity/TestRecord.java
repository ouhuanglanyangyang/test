package com.yll.online_project.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//试题记录
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "试题记录相关")
public class TestRecord {
    @ApiModelProperty(value = "上传试题id")
    @TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "试题id",required = true)
    private String testId;
    @ApiModelProperty(value = "教师编号",required = true)
    private String teacherId;
    @ApiModelProperty(value = "试题名称",required = true)
    private String testName;
    @ApiModelProperty(value = "题目总数",required = true)
    private Integer totalNum;
    @ApiModelProperty(value = "试卷总分",required = true)
    private Integer allScore;
    @ApiModelProperty(value = "创建的时间",required = true)
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @ApiModelProperty(value = "更新的时间",required = true)
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
