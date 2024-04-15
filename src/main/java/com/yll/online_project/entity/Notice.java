package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//公告
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "公告类",description = "公告")
public class Notice {
    @ApiModelProperty(name = "公告id",required = true)
    private Integer id;
    @ApiModelProperty(name = "学生学号/教师编号/系统编号",required = true)
    private String accountId;
    @ApiModelProperty(name = "公告标题",required = true)
    private String nTitle;
    @ApiModelProperty(name = "公告内容",required = true)
    private String nContent;
    @ApiModelProperty(name = "发布时间",required = true)
    private LocalDateTime publishTime;
    @ApiModelProperty(name = "公告浏览量",required = false)
    private Integer view;
}
