package com.yll.online_project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//错题
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "错题类")
public class Wrong {
    @ApiModelProperty(value = "错题id",required = true)
    private Integer id;
    @ApiModelProperty(value = "练题记录的id",required = true)
    private Integer practiceRecodeId;
    @ApiModelProperty(value = "最近错误的时间",required = true)
    private LocalDateTime recentlyTime;
}
