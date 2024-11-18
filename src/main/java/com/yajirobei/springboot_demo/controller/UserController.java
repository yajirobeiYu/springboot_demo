package com.yajirobei.springboot_demo.controller;

import com.yajirobei.springboot_demo.bean.ResultBean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: kipper
 * @CREATE_DATE_TIME: 2024-11-17 14:34
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("{id}")
    public ResultBean getUser(@PathVariable("id") String id,
                              @RequestHeader Map<String,String> headerMap) {
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("id",id);
        userMap.put("name","用户"+id);
        userMap.putAll(headerMap);
        ResultBean success = ResultBean.success(userMap);
        System.out.println(success);
        return success;
    }
}
