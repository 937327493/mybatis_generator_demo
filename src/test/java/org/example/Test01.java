package org.example;

import cn.wangziwei.mybatis.mapper.LogEmpMapper;
import cn.wangziwei.mybatis.pojo.LogEmp;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class Test01 {
    @Resource
    private LogEmpMapper logEmpMapper;
    @Test
    public void test01() {
        List<LogEmp> logEmps = logEmpMapper.selectByExample(null);
        PageHelper.startPage(1, 2);
        System.out.println(logEmps);
    }
}
