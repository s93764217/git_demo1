package com.baizhi;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitDemo1ApplicationTests {

    @Autowired
    private EmpDao empDao;
    @Test
    public void contextLoads() {
        List<Emp> emps = empDao.selectAll();
        for (Emp emp : emps) {
            System.out.println("emp = " + emp);
        }
    }

}
