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
@ApiModel(value = "收藏类")
public class Collect {
    @ApiModelProperty(value = "收藏id")
    private Integer id;
    @ApiModelProperty(value = "练题记录的id",required = true)
    private Integer practiceRecodeId;
    @ApiModelProperty(value = "加入收藏的时间",required = true)
    private LocalDateTime joinTime;
}
