package com.tavisca;

import java.util.ArrayList;
import java.util.List;

public class JoinEmployeeAndDept {

    public static Departments Join(Departments departments, Employees employees){
        departments.getDepartments().stream().forEach(department -> {
            List<Employee> employeeList = new ArrayList<Employee>();
            employees.getEmployees().stream().filter(employee -> employee.deptId == department.deptId).forEach(employee -> {
                employeeList.add(employee);
            });
            department.employees =(ArrayList<Employee>)employeeList;
        });

        return departments;
    }
}
