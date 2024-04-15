package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//试题
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "试题相关")
public class Test {
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "试题id")
    private String testId;
    @ApiModelProperty(value = "题目id")
    private String questionId;
    @ApiModelProperty(value = "序号")
    private Integer serialNumber;
}
