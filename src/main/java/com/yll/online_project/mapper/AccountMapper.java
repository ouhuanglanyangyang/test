package com.yll.online_project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yll.online_project.entity.Account;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@MapperScan
@Repository //代表持久层
public interface AccountMapper extends BaseMapper<Account> {
    //继承之后就是所有东西已经把连接mybatis，配置mapper.xml文件，service-controller层都搞定了
}
