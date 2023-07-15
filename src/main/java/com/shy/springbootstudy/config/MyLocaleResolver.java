package com.shy.springbootstudy.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/15/23:34
 * @Description:
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        // 解析请求中的语言参数
        String langauage = request.getParameter("l");
        // 默认的
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(langauage)) {
            // zh_CN
            String[] split = langauage.split("_");
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
