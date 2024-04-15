package com.yll.online_project;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yll.online_project.entity.Account;
import com.yll.online_project.entity.TestRecord;
import com.yll.online_project.mapper.AccountMapper;
import com.yll.online_project.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OnlineProjectApplicationTests {

    @Test
    void contextLoads() {
    }

//    @Autowired
//    private AccountMapper accountMapper;
//    @Autowired
//    private TestMapper testMapper;
//
//    @Test
//    public void contextLoads() {
//        //查询全部用户
//        List<Account> users = accountMapper.selectList(null);//这个null是有个叫wrapper的东西，里面可以封装各种规范进去，然后给再查询。
//        users.forEach(System.out::println);
//    }
//
//    @Test
//    public void testUpdate(){
//        TestRecord testRecord = new TestRecord();
//        testRecord.setId(1);
//        testRecord.setTestId("ch_001");
//        testMapper.updateById(testRecord);
////        Account account = new Account();
////        account.setId(1);
////        account.setUsername("小小");
////        int i = accountMapper.updateById(account);
////        System.out.println(i);
//    }

//    @Test
//    public void testInsert(){
//        TestRecord testRecord = new TestRecord();
//        testRecord.setTestId("c_001");
//        testRecord.setTeacherId("t_001");
//        testRecord.setTestName("秋季语文期末考试");
//        testRecord.setTotalNum(10);
//        testRecord.setAllScore(100);
//        testMapper.insert(testRecord);
//        Account account = new Account();
//        account.setAccountId("s_002");
//        account.setRole(1);
//        account.setUsername("大大");
//        account.setPassword("222222");
//        account.setIdCard("985928574879");
//        account.setPhoneNum("758743827");
//        account.setAge(22);
//        account.setSex(1);
//        account.setState(0);
//        account.setEMail("6678654667");
//        accountMapper.insert(account);
//    }
//
//    @Test
//    public void testPage(){
//        Page<Account> page = new Page<>(1, 5);
//        accountMapper.selectPage(page,null);
//        page.getRecords().forEach(System.out::println);
//    }
//
//    @Test
//    public void testDeleteById(){
//        accountMapper.deleteById(1);
//    }

}
