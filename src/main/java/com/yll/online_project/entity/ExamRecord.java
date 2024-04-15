package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//考试记录
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "考试记录")
public class ExamRecord {
    @ApiModelProperty(value = "考试记录id",required = true)
    private Integer examId;
    @ApiModelProperty(value = "学生学号",required = true)
    private String studentId;
    @ApiModelProperty(value = "考生作答时间",required = true)
    private LocalDateTime doTime;
    @ApiModelProperty(value = "考生交卷时间",required = true)
    private LocalDateTime handTime;
    @ApiModelProperty(value = "未做题数",required = true)
    private Integer donotNum;
    @ApiModelProperty(value = "选择题得分",required = true)
    private Double optionScore;
    @ApiModelProperty(value = "判断题得分",required = true)
    private Double tfScore;
    @ApiModelProperty(value = "简答题得分",required = true)
    private Double shortScore;
    @ApiModelProperty(value = "学生总得分",required = true)
    private Double studentScore;
    @ApiModelProperty(value = "学生成绩等级",required = true)
    private Integer grade;
    @ApiModelProperty(value = "是否有证书 :0-无,1-有",required = true)
    private Integer isCertificate;
    @ApiModelProperty(value = "创建时间",required = true)
    private LocalDateTime createTime;
}
