package com.yajirobei.springboot_demo.config;

import com.yajirobei.springboot_demo.bean.Yellow;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: yajirobei
 * @CREATE_DATE_TIME: 2024-10-23 22:24
 * @Description:
 */
public class HelloSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.yajirobei.springboot_demo.bean.Yellow"};
    }
}
