package org.example;

import com.github.pagehelper.PageInterceptor;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        MybatisConfig.class,
        MysqlDBConfig.class,
        PageInterceptor.class
})
//@TestPropertySource("classpath:application-test.yml")
@ActiveProfiles("test")
public abstract class AbstractTest {
}
