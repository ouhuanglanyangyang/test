package com.yll.online_project.controller.student;

import com.yll.online_project.entity.Account;
import com.yll.online_project.entity.ResponseResult;
import com.yll.online_project.service.AccountService;
import com.yll.online_project.service.RedisService;
import com.yll.online_project.utils.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = "学生账户管理")
@RestController
@RequestMapping("/api/student/account")
public class SAccountController {
    private final JwtUtil jwtUtil;

    public SAccountController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Autowired
    private AccountService accountService;
    @Autowired
    private RedisService redisService;

//    @PostMapping("/sendCode")
//    @ApiOperation("发送验证码")
//    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号"),
//                        @ApiImplicitParam(name = "email", value = "邮箱号")})
//    public ResponseResult<String> sendCode(@RequestParam("studentId")String studentId, @RequestParam("email")String email){
//        String code=null;
//        return ResponseResult.success(null,code);
//    }

    @PostMapping("/register")
    @ApiOperation("学生注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "role", value = "角色",required = true,dataTypeClass = Integer.class),
            @ApiImplicitParam(name = "username", value = "用户名",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "password", value = "密码",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "idCard", value = "身份证",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "phoneNum", value = "手机号",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "age", value = "年龄",dataTypeClass = Integer.class),
            @ApiImplicitParam(name = "sex", value = "性别",dataTypeClass = Integer.class),
            @ApiImplicitParam(name = "email", value = "邮箱号",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "code", value = "验证码",required = true,dataTypeClass = String.class)})
    public ResponseEntity<ResponseResult<Account>> register(
            @RequestParam("role")Integer role, @RequestParam("username")String username,
            @RequestParam("password")String password,@RequestParam("idCard")String idCard,
            @RequestParam("phoneNum")String phoneNum, @RequestParam(value = "age",required=false)Integer age,
            @RequestParam(value = "sex",required=false)Integer sex, @RequestParam("email")String email,
            @RequestParam("code")String code){
        Account account = new Account();
        account.setRole(role);
        account.setUsername(username);
        account.setPassword(password);
        account.setIdCard(idCard);
        account.setPhoneNum(phoneNum);
        account.setAge(age);
        account.setSex(sex);
        account.setEmail(email);
        Account register = accountService.register(account);
        if (register != null) {
            return ResponseResult.toResponseEntity(HttpStatus.CREATED, "注册成功", register);
        } else {
            return ResponseResult.toResponseEntity(HttpStatus.BAD_REQUEST, "注册失败", null);
        }
    }

    @GetMapping("/login")
    @ApiOperation("学生登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "sIdOrPhoneNum", value = "学生学号/手机号",required = true,dataTypeClass = String.class),
                        @ApiImplicitParam(name = "password", value = "密码",required = true,dataTypeClass = String.class)})
    public ResponseEntity<ResponseResult<String>> login(@RequestParam("sIdOrPhoneNum")String sIdOrPhoneNum,
                                                         @RequestParam("password")String password){
        Account login = accountService.login(sIdOrPhoneNum, password);
        if (login != null) {
            String jwtToken = jwtUtil.generateToken(login.getAccountId(),login.getPhoneNum());
            return ResponseResult.toResponseEntity(HttpStatus.OK, "登录成功", jwtToken);
        } else {
            return ResponseResult.toResponseEntity(HttpStatus.UNAUTHORIZED, "学号/手机号或密码错误", null);
        }
    }

    @GetMapping("/logout")
    @ApiOperation("学生退出登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "token", value = "用户认证令牌", required = false,dataTypeClass = Long.class)})
    public ResponseEntity<ResponseResult<String>> logout(@RequestParam(value = "token", required = false) String token) {
        if (token != null && !token.isEmpty() && jwtUtil.validateToken(token)) {
            redisService.deleteValue(token);//从 Redis 中删除该令牌
            // 返回成功响应，表明用户已退出登录
            return ResponseResult.toResponseEntity(HttpStatus.OK, "退出登录成功", null);
        } else {
            // 如果令牌无效或者未提供令牌，则返回失败响应
            return ResponseResult.toResponseEntity(HttpStatus.UNAUTHORIZED, "退出登录失败，令牌无效或未提供", null);
        }
    }

    @PutMapping("/updateInfo")
    @ApiOperation("修改个人信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号",required = true,dataTypeClass = Long.class),
            @ApiImplicitParam(name = "username", value = "用户名",dataTypeClass = String.class),
            @ApiImplicitParam(name = "age", value = "年龄",dataTypeClass = Integer.class),
            @ApiImplicitParam(name = "sex", value = "性别",dataTypeClass = Integer.class),
            @ApiImplicitParam(name = "email", value = "邮箱号",dataTypeClass = String.class)})
    public ResponseEntity<ResponseResult<Integer>> updateInfo(@RequestParam("studentId")Long studentId, @RequestParam("username")String username,
                                          @RequestParam("age")Integer age, @RequestParam("sex")Integer sex,
                                          @RequestParam("email")String email){
        int update = accountService.updateInfo(studentId, username, age, sex, email);
        if (update> 0) {
            return ResponseResult.toResponseEntity(HttpStatus.OK,"修改个人信息成功",update);
        } else {
            return ResponseResult.toResponseEntity(HttpStatus.BAD_REQUEST,"修改个人信息失败",null);
        }
    }

    @PostMapping("/forgetPwd")
    @ApiOperation("忘记密码")
    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号",required = true,dataTypeClass = Long.class),
            @ApiImplicitParam(name = "email", value = "邮箱号",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "code", value = "验证码",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "newPwd",value = "新密码",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "confirmPwd",value = "确认新密码",required = true,dataTypeClass = String.class)})
    public ResponseEntity<ResponseResult<Integer>> forgetPwd(@RequestParam("studentId")Long studentId, @RequestParam("email")String email,
                                    @RequestParam("code")String code, @RequestParam("newPwd")String newPwd,
                                    @RequestParam("newPwd")String confirmPwd){
        int forgetPwd = accountService.forgetPwd(studentId, email, code, newPwd, confirmPwd);
        if (forgetPwd>0){
            return ResponseResult.toResponseEntity(HttpStatus.OK,"修改密码成功",forgetPwd);
        }else {
            return ResponseResult.toResponseEntity(HttpStatus.BAD_REQUEST,"修改密码失败",null);
        }
    }

    @PostMapping("/updatePwd")
    @ApiOperation("修改密码")
    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号",required = true,dataTypeClass = Long.class),
            @ApiImplicitParam(name = "oldPwd",value = "旧密码",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "newPwd", value = "新密码",required = true,dataTypeClass = String.class)})
    public ResponseEntity<ResponseResult<Integer>> updatePwd(@RequestParam("studentId")Long studentId,
                                             @RequestParam("oldPwd")String oldPwd,
                                             @RequestParam("newPwd")String newPwd){
        Integer updatePwd = accountService.updatePwd(studentId, oldPwd, newPwd);
        if (updatePwd>0){
            return ResponseResult.toResponseEntity(HttpStatus.OK,"修改密码成功",updatePwd);
        }else {
            return ResponseResult.toResponseEntity(HttpStatus.BAD_REQUEST,"修改密码失败",null);
        }
    }

    @PostMapping("/updatePhone")
    @ApiOperation("更换手机号")
    @ApiImplicitParams({@ApiImplicitParam(name = "studentId", value = "学生学号",required = true,dataTypeClass = Long.class),
            @ApiImplicitParam(name = "oldPhone",value = "原手机号",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "code",value = "验证码",required = true,dataTypeClass = String.class),
            @ApiImplicitParam(name = "newPhone", value = "新手机号",required = true,dataTypeClass = String.class)})
    public ResponseEntity<ResponseResult<Integer>> updatePhone(@RequestParam("studentId")Long studentId,
                                                             @RequestParam("oldPhone")String oldPhone,
                                                             @RequestParam("code")String code,
                                                             @RequestParam("newPhone")String newPhone){
        Integer updatePhone = accountService.updatePhone(studentId, oldPhone, code, newPhone);
        if (updatePhone>0){
            return ResponseResult.toResponseEntity(HttpStatus.OK,"修改密码成功",updatePhone);
        }else {
            return ResponseResult.toResponseEntity(HttpStatus.BAD_REQUEST,"修改密码失败",null);
        }
    }
}

