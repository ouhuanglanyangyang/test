package com.yll.online_project.service;

import com.yll.online_project.entity.Account;

public interface AccountService {
    Account register(Account account);

    Account login(String sIdOrPhoneNum,String password);

    Integer updateInfo(Long studentId,String username,Integer age,Integer sex,String email);

    Integer forgetPwd(Long studentId,String email,String code,String newPwd,String confirmPwd);

    Integer updatePwd(Long studentId,String oldPwd,String newPwd);

    Integer updatePhone(Long studentId,String oldPhone,String code,String newPhone);
}
