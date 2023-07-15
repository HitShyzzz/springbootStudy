package com.shy.springbootstudy.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/14/20:26
 * @Description:
 */
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {
    // public interface ViewResolver 实现了viewResolver接口的类就可以看成视图解析器
//    @Bean
//    public ViewResolver myViewResolver(){
//        return new MyViewResolver();
//    }
//
//    public static class MyViewResolver implements ViewResolver {
//
//        @Override
//        public View resolveViewName(String viewName, Locale locale) throws Exception {
//            return null;
//        }
//    }

    // 视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/shy").setViewName("test");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
    }
    // 自定义的国际化
    @Bean
    public LocaleResolver getLocaleResolver() {
        return new MyLocaleResolver();
    }
}
