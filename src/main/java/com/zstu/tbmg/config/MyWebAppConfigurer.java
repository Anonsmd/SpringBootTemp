package com.zstu.tbmg.config;

/**
 * @Author: Anonsmd
 * @Date: 2020/2/3 12:55
 */


import com.zstu.tbmg.component.FilePath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 资源映射路径
 */
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {
    @Autowired
    private FilePath filePath;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/image/**").addResourceLocations("file:"+filePath.returnBasicPath());
    }
}

