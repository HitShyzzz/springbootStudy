package com.shy.springbootstudy.dao;

import com.shy.springbootstudy.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/14/21:51
 * @Description:
 */
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments;
    static {
        departments=new HashMap<Integer, Department>();
        departments.put(101,new Department(101,"教学部"));
        departments.put(102,new Department(102,"市场部"));
        departments.put(103,new Department(103,"教研部"));
        departments.put(104,new Department(104,"运营部"));
        departments.put(105,new Department(105,"后勤部"));
    }
    // 获得部门所有信息
    public Collection<Department> getDepartments() {
        return departments.values();
    }
    // 通过id得到部门
    public Department getDepartmentById(Integer id){
        if (!departments.containsKey(id)){
            return null;
        }
        return departments.get(id);
    }

}
