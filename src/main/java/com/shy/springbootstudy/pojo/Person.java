package com.shy.springbootstudy.pojo;

import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/13/22:20
 * @Description:
 */
@ConfigurationProperties(prefix = "person")
//@PropertySource(value="classpath:shy.properties")
//@Validated // 数据校验
@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
   // @Value("${name}")
  //  @Email(message="用户名格式错误！！@@@")
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;
}
