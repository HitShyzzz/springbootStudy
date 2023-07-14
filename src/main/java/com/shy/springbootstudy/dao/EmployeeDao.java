package com.shy.springbootstudy.dao;

import com.shy.springbootstudy.pojo.Department;
import com.shy.springbootstudy.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/14/22:00
 * @Description:
 */
@Repository
public class EmployeeDao {
    // 模拟员工数据
    private static Map<Integer, Employee> employees;
    @Autowired
    private static DepartmentDao departmentDao;
    static {
        employees=new HashMap<>();
        employees.put(1001,new Employee(1001,"AA","213734821@qq.com",1,departmentDao.getDepartmentById(101)));
        employees.put(1002,new Employee(1002,"BB","223734821@qq.com",0,departmentDao.getDepartmentById(102)));
        employees.put(1003,new Employee(1003,"CC","233734821@qq.com",1,departmentDao.getDepartmentById(103)));
        employees.put(1004,new Employee(1004,"DD","243734821@qq.com",0,departmentDao.getDepartmentById(104)));
        employees.put(1005,new Employee(1005,"EE","253734821@qq.com",1,departmentDao.getDepartmentById(105)));
    }

    // 主键自增
    private static Integer initId=1006;

    // 增加员工
    public void add (Employee employee){
        if (employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }
    // 查询全部员工信息
    public Collection<Employee> getEmployees(){
        return employees.values();
    }
    // 通过id查询员工
    public Employee getEmployeeById(Integer id){
        if (!employees.containsKey(id)){
            return null;
        }
        return employees.get(id);
    }
    // 通过id删除员工
    public void deleteEmployeeById(Integer id){
        employees.remove(id);
    }


}
