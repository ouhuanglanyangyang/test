package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//证书
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "证书类",description = "证书")
public class Certificate {
    @ApiModelProperty(value = "证书id",required = true)
    private Integer id;
    @ApiModelProperty(value = "证书编号",required = true)
    private String certificateCode;
    @ApiModelProperty(value = "学生学号",required = true)
    private Integer studentId;
    @ApiModelProperty(value = "证书名称",required = true)
    private String certificateName;
    @ApiModelProperty(value = "证书详情",required = true)
    private String certificateDetails;
}
