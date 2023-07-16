package com.shy.springbootstudy.controller;

import com.shy.springbootstudy.dao.EmployeeDao;
import com.shy.springbootstudy.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/16/22:18
 * @Description:
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getEmployees();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
}
