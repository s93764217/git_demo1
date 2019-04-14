package com.baizhi.controller;


import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("emp")
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("selectAll")
    public Map selectAll(Map map) {
        map.put("emps", empService.selectAll());
        return map;
    }

}
