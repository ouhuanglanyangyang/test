package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//题库
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "题库类")
public class Depository {
    @ApiModelProperty(value = "题库id",required = true)
    private Integer id;
    @ApiModelProperty(value = "题型id",required = true)
    private String typeId;
    @ApiModelProperty(value = "题库名称",required = true)
    private Integer depositoryName;
    @ApiModelProperty(value = "创建时间",required = true)
    private LocalDateTime creatTime;
    @ApiModelProperty(value = "更新时间",required = true)
    private LocalDateTime updateTime;
}
