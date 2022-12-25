package org.example;

import cn.wangziwei.mybatis.mapper.PeopleEmpMapper;
import cn.wangziwei.mybatis.pojo.PeopleEmp;
import com.github.pagehelper.PageHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.test.annotation.DirtiesContext;

import javax.annotation.Resource;
import java.util.List;

@DirtiesContext
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test01 extends AbstractTest{
    @Resource
    private PeopleEmpMapper peopleEmpMapper;
    @Test
    public void test01_测试分页() {
        PageHelper.startPage(1, 2);
        List<PeopleEmp> peopleEmps = peopleEmpMapper.selectByExample(null);
        System.out.println(peopleEmps);
    }
}
