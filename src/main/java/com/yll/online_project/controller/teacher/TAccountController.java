package com.yll.online_project.controller.teacher;

import com.yll.online_project.entity.Account;
import com.yll.online_project.entity.ResponseResult;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "教师账户管理")
@RestController
@RequestMapping("/api/teacher/account")
public class TAccountController {
//    @PostMapping("/sendCode")
//    @ApiOperation("注册时发送验证码")
//    @ApiImplicitParams({@ApiImplicitParam(name = "teacherId", value = "教师编号"),
//                        @ApiImplicitParam(name = "email", value = "邮箱号")})
//    public ResponseResult<String> sendCode(@RequestParam("adminId")String adminId,@RequestParam("email")String email){
//        String code=null;
//        return ResponseResult.success(code);
//    }
//
//    @PostMapping("/register")
//    @ApiOperation("教师注册")
//    @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "用户名",required = true),
//            @ApiImplicitParam(name = "idCard", value = "身份证",required = true),
//            @ApiImplicitParam(name = "phoneNum", value = "手机号",required = true),
//            @ApiImplicitParam(name = "email", value = "邮箱号",required = true),
//            @ApiImplicitParam(name = "code", value = "验证码",required = true)})
//    public ResponseResult<Account> register(@RequestParam("username")String username,
//                                            @RequestParam("idCard")String idCard, @RequestParam("phoneNum")String phoneNum,
//                                            @RequestParam("email")String email,@RequestParam("code")String code){
//        Account account=new Account();
//        return ResponseResult.success(account);
//    }
//
//    @GetMapping("/login")
//    @ApiOperation("教师登录")
//    @ApiImplicitParams({@ApiImplicitParam(name = "teacherId", value = "教师编号",required = true),
//            @ApiImplicitParam(name = "password", value = "密码",required = true)})
//    public ResponseResult<Account> login(@RequestParam("teacherId")String teacherId,
//                                         @RequestParam("password")String password){
//        return ResponseResult.success(new Account());
//    }
//
//    @GetMapping("/logout")
//    @ApiOperation("教师退出")
//    @ApiImplicitParams({@ApiImplicitParam(name = "teacherId", value = "教师编号",required = true)})
//    public ResponseResult<Integer> logout(@RequestParam("teacherId")String teacherId, @RequestParam("state")int state){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    @PutMapping("/update")
//    @ApiOperation("修改个人信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "teacherId", value = "教师编号"),
//            @ApiImplicitParam(name = "username", value = "用户名"),
//            @ApiImplicitParam(name = "password", value = "密码"),
//            @ApiImplicitParam(name = "phoneNum", value = "手机号"),
//            @ApiImplicitParam(name = "age", value = "年龄"),
//            @ApiImplicitParam(name = "sex", value = "性别"),
//            @ApiImplicitParam(name = "email", value = "邮箱号")})
//    public ResponseResult<Integer> update(@RequestParam("teacherId")String teacherId, @RequestParam("username")String username,
//                                          @RequestParam("password")String password, @RequestParam("phoneNum")String phoneNum,
//                                          @RequestParam("age")Integer age, @RequestParam("sex")Integer sex, @RequestParam("email")String email){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    @PostMapping("/forgetPwd")
//    @ApiOperation("忘记密码")
//    @ApiImplicitParams({@ApiImplicitParam(name = "teacherId", value = "教师编号"),
//            @ApiImplicitParam(name = "email", value = "邮箱号"),
//            @ApiImplicitParam(name = "newPwd",value = "新密码")})
//    public ResponseResult forgetPwd(@RequestParam("teacherId")String teacherId, @RequestParam("email")String email,
//                                    @RequestParam("code")String code,@RequestParam("newPwd")String newPwd){
//        return ResponseResult.success(null);
//    }
//
//    @PostMapping("/updatePwd")
//    @ApiOperation("修改密码")
//    @ApiImplicitParams({@ApiImplicitParam(name = "teacherId", value = "教师编号"),
//            @ApiImplicitParam(name = "newPwd",value = "旧密码"),
//            @ApiImplicitParam(name = "oldPwd", value = "新密码")})
//    public ResponseResult<Integer> updatePwd(@RequestParam("teacherId")String teacherId,
//                                             @RequestParam("oldPwd")String oldPwd,
//                                             @RequestParam("newPwd")String newPwd){
//        int result=0;
//        return ResponseResult.success(result);
//    }
//
//    @PostMapping("/queryAll")
//    @ApiOperation("查询所有学生信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "teacherId", value = "教师编号"),
//            @ApiImplicitParam(name = "accountId", value = "学生学号/教师编号/管理员编号")})
//    public ResponseResult<List<Account>> queryAll(@RequestParam("adminId")String adminId,
//                                                  @RequestParam("accountId") String accountId){
//        List<Account> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }
//
//    @GetMapping("queryByAccountId")
//    @ApiOperation("查询单个学生信息")
//    @ApiImplicitParams({@ApiImplicitParam(name = "accountId", value = "学生学号/教师编号/管理员编号")})
//    public ResponseResult<List<Account>> queryByAccountId(@RequestParam("accountId")String accountId){
//        List<Account> list=new ArrayList<>();
//        return ResponseResult.success(list);
//    }

}

