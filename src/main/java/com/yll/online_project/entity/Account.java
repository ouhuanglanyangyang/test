package com.yll.online_project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "用户类",description = "用户")
public class Account {
    @ApiModelProperty(value = "id", required = true)
    @TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "学生学号/教师编号", required = true)
    private Long accountId;
    @ApiModelProperty(value = "角色", required = true)
    private Integer role;
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    private String password;
    @ApiModelProperty(value = "身份证", required = true)
    private String idCard;
    @ApiModelProperty(value = "手机号", required = true)
    private String phoneNum;
    @ApiModelProperty(value = "年龄")
    private Integer age;
    @ApiModelProperty(value = "性别")
    private Integer sex;
    @ApiModelProperty(value = "邮箱号", required = true)
    private String email;
    @ApiModelProperty(value = "状态")
    private Integer state;
    @ApiModelProperty(value = "逻辑删除")
    @TableLogic //逻辑删除
    private Integer isDelete;
    @ApiModelProperty(value = "头像")
    private String head_picture;
}
