package com.yll.online_project.controller.admin;

import com.yll.online_project.entity.Account;
import com.yll.online_project.entity.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "管理员账户管理")
@RestController
@RequestMapping("/api/admin/account")
public class AAccountController {
//    @PostMapping("/sendCode")
//    @ApiOperation("注册时发送验证码")
//    @ApiImplicitParams({@ApiImplicitParam(name = "adminId", value = "管理员编号",dataTypeClass = String.class),
//                        @ApiImplicitParam(name = "email", value = "邮箱号",dataTypeClass = String.class)})
//    public ResponseResult<String> sendCode(@RequestParam("adminId")String adminId,@RequestParam("email")String email){
//        String code=null;
//        return ResponseResult.success(code);
//    }
//
//    @PostMapping("/register")
//    @ApiOperation("管理员注册")
//    @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "用户名",required = true,dataTypeClass = String.class),
//                        @ApiImplicitParam(name = "password", value = "密码",required = true,dataTypeClass = String.class),
//                        @ApiImplicitParam(name = "idCard", value = "身份证",required = true,dataTypeClass = Integer.class),
//                        @ApiImplicitParam(name = "phoneNum", value = "手机号",required = true,dataTypeClass = Integer.class),
//                        @ApiImplicitParam(name = "age", value = "年龄",dataTypeClass = Integer.class),
//                        @ApiImplicitParam(name = "sex", value = "性别",dataTypeClass = Integer.class),
//                        @ApiImplicitParam(name = "email", value = "邮箱号",required = true,dataTypeClass = String.class),
//                        @ApiImplicitParam(name = "code", value = "验证码",required = true,dataTypeClass = String.class)})
//    public ResponseResult<Account> register(@RequestParam("username")String username, @RequestParam("password")String password,
//                                            @RequestParam("idCard")String idCard, @RequestParam("phoneNum")String phoneNum,
//                                            @RequestParam(value = "age",required=false)Integer age, @RequestParam(value = "sex",required=false)Integer sex,
//                                            @RequestParam("email")String email,@RequestParam("code")String code){
//        Account account=new Account();
//        return ResponseResult.success(account);
//    }
//
//    @GetMapping("/login")
//    @ApiOperation("管理员登录")
//    @ApiImplicitParams({@ApiImplicitParam(name = "adminId", value = "管理员编号",required = true,dataTypeClass = Integer.class),
//                        @ApiImplicitParam(name = "username", value = "用户名",required = true,dataTypeClass = Integer.class),
//                        @ApiImplicitParam(name = "password", value = "密码",required = true,dataTypeClass = Integer.class)})
//    public ResponseResult<Account> login(@RequestParam("adminId")String adminId,
//                                         @RequestParam("username")String username,
//                                         @RequestParam("password")String password){
//        return ResponseResult.success(new Account());
//    }
//
//    @GetMapping("/logout")
//    @ApiOperation("管理员退出")
//    @ApiImplicitParams({@ApiImplicitParam(name = "adminId", value = "管理员编号",required = true,dataTypeClass = String.class)})
//    public ResponseResult<Integer> logout(@RequestParam("adminId")String adminId, @RequestParam("state")int state){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    @PutMapping("/update")
//    @ApiOperation("修改个人信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "adminId", value = "管理员编号",dataTypeClass = String.class),
//            @ApiImplicitParam(name = "username", value = "用户名",dataTypeClass = String.class),
//            @ApiImplicitParam(name = "password", value = "密码",dataTypeClass = String.class),
//            @ApiImplicitParam(name = "phoneNum", value = "手机号",dataTypeClass = Integer.class),
//            @ApiImplicitParam(name = "age", value = "年龄",dataTypeClass = Integer.class),
//            @ApiImplicitParam(name = "sex", value = "性别",dataTypeClass = Integer.class),
//            @ApiImplicitParam(name = "email", value = "邮箱号",dataTypeClass = String.class)})
//    public ResponseResult<Integer> update(@RequestParam("adminId")String adminId, @RequestParam("username")String username,
//                                          @RequestParam("password")String password, @RequestParam("phoneNum")String phoneNum,
//                                          @RequestParam("age")Integer age, @RequestParam("sex")Integer sex, @RequestParam("email")String email){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    @PostMapping("/forgetPwd")
//    @ApiOperation("忘记密码")
//    @ApiImplicitParams({@ApiImplicitParam(name = "adminId", value = "管理员编号",dataTypeClass = String.class),
//                        @ApiImplicitParam(name = "email", value = "邮箱号",dataTypeClass = String.class),
//                        @ApiImplicitParam(name = "newPwd",value = "新密码",dataTypeClass = String.class)})
//    public ResponseResult forgetPwd(@RequestParam("adminId")String adminId, @RequestParam("email")String email,
//                                    @RequestParam("code")String code,@RequestParam("newPwd")String newPwd){
//        return ResponseResult.success(null);
//    }
//
//    @PostMapping("/updatePwd")
//    @ApiOperation("修改密码")
//    @ApiImplicitParams({@ApiImplicitParam(name = "adminId", value = "管理员编号",dataTypeClass = String.class),
//            @ApiImplicitParam(name = "newPwd",value = "旧密码",dataTypeClass = String.class),
//            @ApiImplicitParam(name = "oldPwd", value = "新密码",dataTypeClass = String.class)})
//    public ResponseResult<Integer> updatePwd(@RequestParam("adminId")String adminId,
//                                             @RequestParam("oldPwd")String oldPwd,
//                                             @RequestParam("newPwd")String newPwd){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    @PostMapping("/queryAll")
//    @ApiOperation("查询所有账户信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "adminId", value = "管理员编号",dataTypeClass = String.class),
//                        @ApiImplicitParam(name = "accountId", value = "学生学号/教师编号/管理员编号",dataTypeClass = String.class)})
//    public ResponseResult<List<Account>> queryAll(@RequestParam("adminId")String adminId,
//                                                  @RequestParam("accountId") String accountId){
//        List<Account> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @GetMapping("queryByAccountId")
//    @ApiOperation("查询单个账户信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "accountId", value = "学生学号/教师编号/管理员编号",dataTypeClass = String.class)})
//    public ResponseResult<List<Account>> queryByAccountId(@RequestParam("accountId")String accountId){
//        List<Account> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
}

