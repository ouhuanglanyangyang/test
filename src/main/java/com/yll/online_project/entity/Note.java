package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "笔记类")
public class Note {
    @ApiModelProperty(value = "笔记id")
    private Integer id;
    @ApiModelProperty(value = "练题记录的id",required = true)
    private Integer practiceRecodeId;
    @ApiModelProperty(value = "笔记内容",required = true)
    private String content;
    @ApiModelProperty(value = "添加笔记时间",required = true)
    private LocalDateTime addTime;
    @ApiModelProperty(value = "更新笔记时间",required = true)
    private LocalDateTime updateTime;
}
