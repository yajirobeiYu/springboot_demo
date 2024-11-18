package com.yajirobei.springboot_demo.config;

import com.yajirobei.springboot_demo.bean.Red;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: yajirobei
 * @CREATE_DATE_TIME: 2024-10-23 22:23
 * @Description:
 */
@Configuration
@Import({Red.class,HelloSelector.class})
public class HelloConfig {
}
