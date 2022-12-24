package cn.wangziwei.controller;

import cn.wangziwei.mybatis.mapper.PeopleEmpMapper;
import cn.wangziwei.mybatis.pojo.PeopleEmp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PageController {
    @Resource
    private PeopleEmpMapper peopleEmpMapper;
    @GetMapping("getMsg")
    public List<PeopleEmp> getMsg() {
        PageHelper.startPage(1, 2);
        List<PeopleEmp> logEmps = peopleEmpMapper.selectByExample(null);
        return logEmps;
    }
}
