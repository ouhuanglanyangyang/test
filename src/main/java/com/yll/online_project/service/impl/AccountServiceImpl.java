package com.yll.online_project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.yll.online_project.entity.Account;
import com.yll.online_project.mapper.AccountMapper;
import com.yll.online_project.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;
    @Autowired
    private PasswordEncoder passwordEncoder; // 注入密码编码器

    @Transactional // 确保注册过程是一个事务
    public Account register(Account account) {
        // 验证身份证是否存在
        QueryWrapper<Account> wrapperIdCard = new QueryWrapper<>();
        wrapperIdCard.eq("id_card", account.getIdCard());
        Account selectIdCard = accountMapper.selectOne(wrapperIdCard);
        if (selectIdCard!=null){
            throw new RuntimeException("该身份证号码已注册，请重新输入！");
        }
        // 验证手机号是否存在
        QueryWrapper<Account> wrapperPhoneNum = new QueryWrapper<>();
        wrapperPhoneNum.eq("phone_num",account.getPhoneNum());
        Account selectPhoneNum = accountMapper.selectOne(wrapperPhoneNum);
        if (selectPhoneNum!=null){
            throw new RuntimeException("该手机号已注册，请重新输入！");
        }
        // 验证邮箱是否已存在
        QueryWrapper<Account> wrapperEmail = new QueryWrapper<>();
        wrapperEmail.eq("email",account.getEmail());
        Account selectEmail = accountMapper.selectOne(wrapperEmail);
        if (selectEmail!=null){
            throw new RuntimeException("该邮箱已注册，请重新输入！");
        }
        // 用户注册时，自动生成account_id的值
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmm");
        String timeStr = sdf.format(new Date()); // 获取格式化后的时间字符串
        Random random = new Random();
        int randomPart = random.nextInt(1000); // 生成一个三位随机数
        long accountId = Long.parseLong(timeStr + String.format("%03d", randomPart));// 拼接字符串并转换为long类型
        account.setAccountId(accountId);
        //将用户注册时输入的密码加密
        String encodedPassword = passwordEncoder.encode(account.getPassword());
        account.setPassword(encodedPassword); // 将加密后的密码设置回Account对象
        accountMapper.insert(account);
        // 如果需要，可以在这里发送注册成功邮件或进行其他操作
        return account;
    }

    @Override
    public Account login(String sIdOrPhoneNum, String password) {
        QueryWrapper<Account> wrapperLogin = new QueryWrapper<>();
        wrapperLogin.eq("account_id",sIdOrPhoneNum).or().eq("phone_num",sIdOrPhoneNum);
        wrapperLogin.eq("password",password);
        Account account = accountMapper.selectOne(wrapperLogin);
        if (account==null){
            throw new RuntimeException("学号/手机号或密码输入错误，请重新输入！");
        }
        return account;
    }

    @Override
    public Integer updateInfo(Long studentId, String username, Integer age, Integer sex, String email) {
        Account account = new Account();
        account.setUsername(username);
        account.setAge(age);
        account.setSex(sex);
        account.setEmail(email);
        // 验证邮箱是否已存在
        QueryWrapper<Account> wrapperEmail = new QueryWrapper<>();
        wrapperEmail.eq("email",email);
        Account selectEmail = accountMapper.selectOne(wrapperEmail);
        if (selectEmail !=null){
            throw new RuntimeException("该邮箱已存在，请重新输入！");
        }
        UpdateWrapper<Account> wrapperUpdate = new UpdateWrapper<>();
        wrapperUpdate.eq("account_id", studentId);
        Integer update = accountMapper.update(account, wrapperUpdate);
        if (update==0){
            throw new RuntimeException("学号输入错误，请重新输入！");
        }
        return update;
    }

    @Override
    public Integer forgetPwd(Long studentId, String email, String code, String newPwd, String confirmPwd) {
        if (!newPwd.equals(confirmPwd)) {
            throw new RuntimeException("两次密码输入错误，请重新输入！");
        }
        Account account=new Account();
        account.setPassword(newPwd);
        QueryWrapper<Account> wrapperEmail = new QueryWrapper<>();
        wrapperEmail.eq("email",email);
        wrapperEmail.eq("account_id",studentId);
        Account selectEmail = accountMapper.selectOne(wrapperEmail);
        if (selectEmail ==null){
            throw new RuntimeException("邮箱号输入错误，请重新输入！");
        }
        return accountMapper.update(account,wrapperEmail);
    }

    @Override
    public Integer updatePwd(Long studentId, String oldPwd, String newPwd) {
        Account account=new Account();
        account.setPassword(newPwd);
        QueryWrapper<Account> wrapperPwd = new QueryWrapper<>();
        wrapperPwd.eq("account_id",studentId);
        wrapperPwd.eq("password",oldPwd);
        Account selectPwd = accountMapper.selectOne(wrapperPwd);
        if (selectPwd==null){
            throw new RuntimeException("原密码或账户输入错误，请重新输入！");
        }
        return accountMapper.update(account,wrapperPwd);
    }

    @Override
    public Integer updatePhone(Long studentId, String oldPhone, String code, String newPhone) {
        // 检查新手机号是否已存在
        QueryWrapper<Account> wrapperNewPhone = new QueryWrapper<>();
        wrapperNewPhone.eq("phone_num", newPhone);
        Account selectNewPhone = accountMapper.selectOne(wrapperNewPhone);
        if (selectNewPhone != null) {
            throw new RuntimeException("该手机号已注册，请重新输入！");
        }
        // 根据studentId找到账户并更新手机号
        QueryWrapper<Account> wrapperStudentId = new QueryWrapper<>();
        wrapperStudentId.eq("account_id", studentId);
        Account account=new Account();
        account.setPhoneNum(newPhone);
        return accountMapper.update(account, wrapperStudentId);
    }
}
