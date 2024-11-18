package com.yajirobei.springboot_demo.controller;

import com.yajirobei.springboot_demo.bean.ResultBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yajirobei
 * @CREATE_DATE_TIME: 2024-10-23 16:53
 * @Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResultBean hello() {
        Map<String,Object> m = new HashMap<>();
        m.put("name","张三丰");
        m.put("age",39);
        m.put("address","北京市通州区");
        ResultBean success = ResultBean.success(m);
        System.out.println(success);
        return success;
    }
}
