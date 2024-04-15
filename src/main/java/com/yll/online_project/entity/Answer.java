package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "答案类",description = "答案")
public class Answer {
    @ApiModelProperty(value = "答案id",required = true)
    private Integer id;
    @ApiModelProperty(value = "题目id",required = true)
    private String questionId;
    @ApiModelProperty(value = "学生学号",required = true)
    private String studentId;
    @ApiModelProperty(value = "正确答案",required = true)
    private String correctAnswer;
    @ApiModelProperty(value = "考试答案")
    private String examAnswer;
    @ApiModelProperty(value = "练题答案")
    private String depositoryAnswer;
    @ApiModelProperty(value = "解析",required = true)
    private String analysis;
}
