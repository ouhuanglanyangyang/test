package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "题目相关")
public class Question {
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "题目id",required = true)
    private String questionId;
    @ApiModelProperty(value = "题型id",required = true)
    private Integer typeId;
    @ApiModelProperty(value = "教师编号",required = true)
    private String teacherId;
    @ApiModelProperty(value = "题序",required = true)
    private Integer serialNumber;
    @ApiModelProperty(value = "题干内容",required = true)
    private String questionContent;
    @ApiModelProperty(value = "选项A")
    private String optA;
    @ApiModelProperty(value = "选项B")
    private String optB;
    @ApiModelProperty(value = "选项C")
    private String optC;
    @ApiModelProperty(value = "选线D")
    private String optD;
    @ApiModelProperty(value = "选项图片")
    private String optImg;
    @ApiModelProperty(value = "题干图片")
    private String questionImg;
    @ApiModelProperty(value = "题目分值",required = true)
    private Integer questionScore;
}
