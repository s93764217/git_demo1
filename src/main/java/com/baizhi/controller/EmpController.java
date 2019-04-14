package com.baizhi.controller;


import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("index")
    public String selectAll(Map map) {
        map.put("emps", empService.selectAll());
        return "index";
    }

}
