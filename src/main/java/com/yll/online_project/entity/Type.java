package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//题型
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "题型类")
public class Type {
    @ApiModelProperty(value = "题型id",required = true)
    private Integer id;
    @ApiModelProperty(value = "题型名称：1-单选题，2-多选题，3-判断题，4-简答题")
    private Integer typeName;
}
