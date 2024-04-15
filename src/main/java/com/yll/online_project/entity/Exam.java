package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//考试
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "考试类")
public class Exam {
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "考试id",required = true)
    private String examId;
    @ApiModelProperty(value = "试题id",required = true)
    private String testId;
    @ApiModelProperty(value = "证书id",required = true)
    private String certificateId;
    @ApiModelProperty(value = "学生学号/教师编号",required = true)
    private String sId;
    @ApiModelProperty(value = "科目名称",required = true)
    private String subject;
    @ApiModelProperty(value = "考试标题",required = true)
    private String eTitle;
    @ApiModelProperty(value = "及格分数",required = true)
    private Integer passScore;
    @ApiModelProperty(value = "难度",required = true)
    private String difficulty;
    @ApiModelProperty(value = "试卷总分",required = true)
    private Integer allScore;
    @ApiModelProperty(value = "总题数",required = true)
    private Integer totalNum;
    @ApiModelProperty(value = "考试状态 0-未完成，1-正在考试，2-已完成",required = true)
    private Integer state;
    @ApiModelProperty(value = "开始时间",required = true)
    private LocalDateTime startTime;
    @ApiModelProperty(value = "结束时间",required = true)
    private LocalDateTime endTime;
    @ApiModelProperty(value = "考试总时长",required = true)
    private String totalTime;
}
