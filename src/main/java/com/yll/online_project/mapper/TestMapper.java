package com.yll.online_project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yll.online_project.entity.TestRecord;
import org.springframework.stereotype.Repository;

@Repository //代表持久层
public interface TestMapper extends BaseMapper<TestRecord> {
}
