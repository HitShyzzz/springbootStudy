package com.shy.springbootstudy.pojo;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/13/22:17
 * @Description:
 */

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dog {
    // 传统属性赋值的方式
   // @Value("旺财")
    private String name;
   // @Value("3")
    private Integer age;
}
